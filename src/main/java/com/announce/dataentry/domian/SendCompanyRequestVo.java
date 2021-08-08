package com.announce.dataentry.domian;

import com.announce.dataentry.domian.secondrequest.SelfSupportPlatForm;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @Description 披露机构基本信息传输入参对象
 * @Author:sjZhao
 * @Date:2021/8/7 14:39
 */
@Data
public class SendCompanyRequestVo {

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
    private String companyCode;

    /**
     * 机构类型
     * 1 - 中介机构
     * 2 - 商业银行
     */
    @NotBlank(message = "机构类型不能为空")
    @ApiModelProperty(value = "机构类型",required = true)
    private String companyType;

    /**
     * 机构名称
     */
    @NotBlank(message = "机构名称不能为空")
    @ApiModelProperty(value = "机构名称",required = true)
    private String companyName;

    /**
     * 机构简称
     */
    @NotBlank(message = "机构简称不能为空")
    @ApiModelProperty(value = "机构简称",required = true)
    private String CompanySimpleName;

    /**
     * 自营网络平台情况（多例）
     */
    private List<SelfSupportPlatForm> selfSupportPlatForms;

    /**
     * 客户服务及消费者投诉电话
     */
    @NotBlank(message = "客户服务及消费者投诉电话不能为空")
    @ApiModelProperty(value = "客户服务及消费者投诉电话",required = true)
    private String internetPhone;

    /**
     * 机构信息披露网站地址
     */
    @NotBlank(message = "机构信息披露网站地址不能为空")
    @ApiModelProperty(value = "机构信息披露网站地址",required = true)
    private String comArea;

    /**
     * 公司官网链接
     */
    @NotBlank(message = "公司官网链接不能为空")
    @ApiModelProperty(value = "公司官网链接",required = true)
    private String ComInternetLink;

    /**
     * 注册资本
     */
    @NotBlank(message = "注册资本不能为空")
    @ApiModelProperty(value = "注册资本",required = true)
    private String registeredCapital;

    /**
     * 注册地
     */
    @NotBlank(message = "注册地不能为空")
    @ApiModelProperty(value = "注册地",required = true)
    private String registAreaCode;

    /**
     * 设立时间
     */
    @NotBlank(message = "设立时间不能为空")
    @ApiModelProperty(value = "设立时间",required = true)
    private String settingTime;

    /**
     * 机构地址
     */
    @NotBlank(message = "机构地址不能为空")
    @ApiModelProperty(value = "机构地址",required = true)
    private String companyArea;

    /**
     * phoneNum 联系电话
     */
    @NotBlank(message = "联系电话不能为空")
    @ApiModelProperty(value = "联系电话",required = true)
    private String phoneNum;

    /**
     * 承诺函文件
     */
    @NotBlank(message = "承诺函文件不能为空")
    @ApiModelProperty(value = "承诺函文件",required = true)
    private String commitmentLette;

    /**
     * 数据状态
     */
    @NotBlank(message = "数据状态不能为空")
    @ApiModelProperty(value = "数据状态",required = true)
    private String dataStatus;


}
