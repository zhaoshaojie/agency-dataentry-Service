package com.announce.dataentry.domian;

import com.announce.dataentry.domian.secondrequest.HistoryCompanyInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @Description 二级分公司、落地服务机构、自营平台、转委托机构、合作技术支持、客户服务机构置为历史接口
 * @Author:sjZhao
 * @Date:2021/8/7 15:02
 */
@Data
public class SendSetHistoryRequestVo {

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
     * 需置为历史数据的机构信息
     * （多个）
     */
    private List<HistoryCompanyInfo> historyCompanyInfoList;
}
