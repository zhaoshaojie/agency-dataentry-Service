package com.announce.dataentry.config;

/**
 * @Description 接口返回状态码集合
 * @Author:sjZhao
 * @Date:2021/8/713:48
 */
public final class ResponseCode {

    public static final String SUCCESS = "200";   //成功
    public static final String ERROR_1001 = "1001";//入参异常
    public static final String ERROR_1002= "1002";//身份验证失败
    public static final String ERROR_1003= "1003";//sign签名验证错误
    public static final String ERROR_1005 = "1005";//参数验证错误(部不满足是否必传、字数长度校验、枚举值不匹配、唯一标识重复等)
    public static final String ERROR_1006 = "1006";//披露机构在机构目录库中不存在
    public static final String ERROR_1007 = "1007";//披露数据不在变更范围内
    public static final String ERROR_1009 = "1009";//机构基本信息未披露

}