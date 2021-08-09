package com.announce.dataentry.service;

import com.announce.dataentry.config.Result;
import com.announce.dataentry.domian.SendAgencyRequestVo;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.PAForUserEnc;

/**
 * @Description 互联网端信息披露数据收集Service
 * @Author:sjZhao
 * @Date:2021/8/7 15:08
 */
@Service
public interface AgencyDataEntryService {

    /**
     * 验证用户信息
     * @param tKey
     * @param X_Auth_Token
     * @return
     */
    boolean verifyUserInfo(String tKey,String X_Auth_Token);

    /**
     * 银保信调用行业协会机构目录库新增/修改接口
     * @return
     */
    Result sendAgencyInfo(SendAgencyRequestVo sendAgencyRequestVo);
}
