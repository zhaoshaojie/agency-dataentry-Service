package com.announce.dataentry.operation.domian.secondrequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Description 二级分公司/落地服务机构信息
 * @Author:sjZhao
 * @Date:2021/8/814:04
 */
@Data
public class CompanyInfo {

    /**
     * 数据唯一性标识
     */
//    @NotBlank(message = "数据唯一性标识不能为空")
    @ApiModelProperty(value = "数据唯一性标识",required = true)
    private String secondBranchNum;

    /**
     *  二级分公司名称/落地服务机构名称
     */
//    @NotBlank(message = "二级分公司名称/落地服务机构名称不能为空")
    @ApiModelProperty(value = "二级分公司名称/落地服务机构名称",required = true)
    private String secondComName    ;

    /**
     *  办公地址
     */
//    @NotBlank(message = "办公地址不能为空")
    @ApiModelProperty(value = "办公地址",required = true)
    private String seconddeskArea;

    /**
     *  电话号码
     */
//    @NotBlank(message = "电话号码不能为空")
    @ApiModelProperty(value = "电话号码",required = true)
    private String secondphone;

    /**
     *  数据类型 1-二级分公司  2-落地服务机构
     */
//    @NotBlank(message = "数据类型不能为空")
    @ApiModelProperty(value = "数据类型",required = true)
    private String datatype;

    /**
     *  数据状态 1-新增  2-修改
     */
//    @NotBlank(message = "数据状态不能为空")
    @ApiModelProperty(value = "数据状态",required = true)
    private String dataStatus;
}
