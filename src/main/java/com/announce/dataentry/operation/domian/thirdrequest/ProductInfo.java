package com.announce.dataentry.operation.domian.thirdrequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Description 自营平台下保险产品信息
 * @Author:sjZhao
 * @Date:2021/8/813:54
 */
@Data
public class ProductInfo {

    /**
     * 机构代码
     */
    @ApiModelProperty(value = "机构代码",required = true)
    private String companyCode;


    /**
     * 保险产品唯一标识
     */
    @ApiModelProperty(value = "保险产品唯一标识",required = true)
    private String productRecord;


    /**
     * 互联网保险产品数据类型   1-互联网保险产品新增
     */
    @ApiModelProperty(value = "互联网保险产品数据类型",required = true)
    private String proDataStatus;
}
