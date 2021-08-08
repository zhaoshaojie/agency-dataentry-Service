package com.announce.dataentry.service;

import org.springframework.stereotype.Service;

/**
 * @Description 互联网端信息披露数据收集Service
 * @Author:sjZhao
 * @Date:2021/8/7 15:08
 */
@Service
public interface AgencyDataEntryService {

    /**
     * 验证用户登录信息
     * @param requestTime
     * @param X_Auth_Token
     * @return
     */
    public boolean verifyUserInfo(String requestTime,String X_Auth_Token);
}
