package com.announce.dataentry.operation.domian;

import com.announce.dataentry.operation.domian.secondrequest.SendProductPlatform;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @Description 自营平台销售互联网保险产品新增入参对象
 * @Author:sjZhao
 * @Date:2021/8/714:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SendProductRequestVo {

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
     * 自营平台及所属产品信息
     */
    private List<SendProductPlatform> sendProductPlatformList;

}
