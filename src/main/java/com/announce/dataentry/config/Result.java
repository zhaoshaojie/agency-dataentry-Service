package com.announce.dataentry.config;

import lombok.Data;

import java.io.Serializable;

/**
 * 统一消息返回类
 * @Description
 * @Author:sjZhao
 * @Date:2021/8/713:47
 */
@Data
public class Result implements Serializable {
    private static final long serialVersionUID = -3948389268046368059L;

    private static final String STATUS_SUCCESS="success";
    private static final String STATUS_FAIL="fail";

    private String code;// 状态码,对应ResponseCode中的数据
    private String status;//success 成功  fail 失败

    private Object message;//消息内容

    private String responseTime;//响应时间

    private String bizid;//批次ID


    public Result(String code, String status,Object message,String responseTime,String bizid) {
        this.code = code;
        this.status = code;
        this.message = code;
        this.responseTime = code;
        this.bizid = code;
    }

    public static Result success() {
        Result Result = new Result();
        Result.setCode(ResponseCode.SUCCESS);
        return Result;
    }

    public static Result success(Object message) {
        Result Result = new Result();
        Result.setCode(ResponseCode.SUCCESS);
        Result.setMessage(message);
        return Result;
    }

    public static Result failure(String code, String message) {
        Result Result = new Result();
        Result.setCode(code);
        Result.setMessage(message);
        return Result;
    }
}
