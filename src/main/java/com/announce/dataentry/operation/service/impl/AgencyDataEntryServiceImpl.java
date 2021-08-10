package com.announce.dataentry.operation.service.impl;

import com.announce.dataentry.Util.MD5Util;
import com.announce.dataentry.config.Result;
import com.announce.dataentry.operation.domian.SendAgencyRequestVo;
import com.announce.dataentry.operation.entity.Syscompany;
import com.announce.dataentry.operation.entity.Sysuser;
import com.announce.dataentry.operation.mapper.SysuserMapper;
import com.announce.dataentry.operation.service.AgencyDataEntryService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description 互联网端信息披露数据收集服务实现类
 * @Author:sjZhao
 * @Date:2021/8/7 15:10
 */
@Service
@Slf4j
public class AgencyDataEntryServiceImpl implements AgencyDataEntryService {

    @Resource
    private SysuserMapper sysuserMapper;
    /**
     * 验证用户信息
     * @param tKey
     * @param X_Auth_Token
     * @return
     */
    @Override
    public boolean verifyUserInfo(String userName,String tKey, String X_Auth_Token) {
        try{
            //用户传入的MD5加密，后用base64处理的数据后的数据
            String token =  new String(Base64Utils.decodeFromString(X_Auth_Token),"utf-8");
            //根据用户名获取数据库中的密码
           // String passWord = "123456";
            LambdaQueryWrapper<Sysuser> queryWrapper = new LambdaQueryWrapper<>();
            queryWrapper.eq(Sysuser::getUserName, userName);
            Sysuser sysuser = sysuserMapper.selectOne(queryWrapper);
            //将获取的密码通过同样的时间戳加盐，比较是否相同
            String passWord = sysuser.getPassWord();
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

    /**
     * 银保信调用行业协会机构目录库新增/修改接口
     * @return
     */
    @Override
    public Result sendAgencyInfo(SendAgencyRequestVo sendAgencyRequestVo) {
        Syscompany syscompany = new Syscompany();

        return null;
    }
}
