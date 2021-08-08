package com.announce.dataentry.service.impl;

import com.announce.dataentry.Util.MD5Util;
import com.announce.dataentry.Util.TimeUtil;
import com.announce.dataentry.service.AgencyDataEntryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Base64Utils;

/**
 * @Description 互联网端信息披露数据收集服务实现类
 * @Author:sjZhao
 * @Date:2021/8/7 15:10
 */
@Slf4j
public class AgencyDataEntryServiceImpl implements AgencyDataEntryService {


    /**
     * 验证用户登录信息
     * @param tKey
     * @param X_Auth_Token
     * @return
     */
    @Override
    public boolean verifyUserInfo(String tKey, String X_Auth_Token) {
        //验证用户信息
        try{
           // String tKey = TimeUtil.dateToStamp(requestTime);//盐值
            //用户传入的MD5加密，后用base64处理的数据后的数据
            String token =  new String(Base64Utils.decodeFromString(X_Auth_Token),"utf-8");
            //根据用户名获取数据库中的密码
            String passWord = "";
            //将获取的密码通过同样的时间戳加盐，比较是否相同
            String result = MD5Util.GetMD5Code(passWord+tKey);
            if(token.equals(result)){
                return true;
            }
        }catch (Exception e){
            log.error("用户信息解密失败",e);
            return false;
        }
        return false;
    }
}
