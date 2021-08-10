package com.announce.dataentry.operation.domian;

import io.netty.util.internal.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;

/**
 * 机构目录库传输入参对象
 * @Description
 * @Author:sjZhao
 * @Date:2021/8/7 14:30
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SendAgencyRequestVo {

    /**
     * 密码加密+请求时间戳为salt
     */
    @NotBlank(message = "Token不能为空")
    @ApiModelProperty(value = "Token",required = true)
    private String x_Auth_Token;

    @NotBlank(message = "用户名不能为空")
    @ApiModelProperty(value = "用户名",required = true)
    private String username;

    /**
     * 时间戳	tKey为东八区当前时间戳，精确到秒，10位长度。例如：1577352217
     */
    @NotBlank(message = "时间戳为空")
    @ApiModelProperty(value = "请求戳",required = true)
    private long tkey;

    /**
     * 请求时间 yyyy-MM-dd HH:mm:ss格式
     */
    @NotBlank(message = "请求时间为空")
    @ApiModelProperty(value = "请求时间",required = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String requestTime;


    /**
     * 机构代码
     */
    @NotBlank(message = "机构代码不能为空")
    @ApiModelProperty(value = "机构代码",required = true)
    private String comCode;

    /**
     * 机构类型
     * 1 - 中介机构
     * 2 - 商业银行
     */
    @NotBlank(message = "机构类型不能为空")
    @ApiModelProperty(value = "机构类型",required = true)
    private String comType;

    /**
     * 机构中文全称
     */
    @ApiModelProperty(value = "机构中文全称",required = true)
    private String cnFullName;


    /**
     *  数据状态 1-新增  2-修改
     */
    @NotBlank(message = "数据状态不能为空")
    @ApiModelProperty(value = "数据状态",required = true)
    private String dataStatus;

    public String checkData(){
        if(StringUtil.isNullOrEmpty(x_Auth_Token)) return "Token不能为空";
        if(StringUtil.isNullOrEmpty(username)) return "用户名不能为空";
        if(StringUtil.isNullOrEmpty(String.valueOf(tkey))) return "时间戳不能为空";
        if(StringUtil.isNullOrEmpty(requestTime))return "请求时间不能为空";
        if(StringUtil.isNullOrEmpty(comCode)) return "机构代码不能为空";
        if(StringUtil.isNullOrEmpty(comType)) return "机构类型不能为空";
        if(StringUtil.isNullOrEmpty(cnFullName)) return "机构名称不能为空";
        if(StringUtil.isNullOrEmpty(dataStatus)) return "数据状态不能为空";
        return null;
    }
}
