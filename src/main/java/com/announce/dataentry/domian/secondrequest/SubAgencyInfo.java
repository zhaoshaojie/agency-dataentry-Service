package com.announce.dataentry.domian.secondrequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Description 转委托机构的机构信息详情
 * @Author:sjZhao
 * @Date:2021/8/814:19
 */
@Data
public class SubAgencyInfo {

    /**
     * 序号
     */
    @NotBlank(message = "序号不能为空")
    @ApiModelProperty(value = "序号",required = true)
    private String sendSubAgencyNum;

    /**
     * 转委托机构代码
     */
    @NotBlank(message = "转委托机构代码")
    @ApiModelProperty(value = "转委托机构代码",required = true)
    private String subAgencyComCode;

    /**
     * 转委托机构简称
     */
    @NotBlank(message = "转委托机构简称不能为空")
    @ApiModelProperty(value = "转委托机构简称",required = true)
    private String subAgencySimpleName;

    /**
     * 转委托机构全称
     */
    @NotBlank(message = "转委托机构全称不能为空")
    @ApiModelProperty(value = "转委托机构全称",required = true)
    private String subAgencyFullName;

    /**
     * 业务合作起始时间
     */
    @NotBlank(message = "业务合作起始时间不能为空")
    @ApiModelProperty(value = "业务合作起始时间",required = true)
    private String susStartTime;

    /**
     * 业务合作终止时间
     */
    @NotBlank(message = "业务合作终止时间不能为空")
    @ApiModelProperty(value = "业务合作终止时间",required = true)
    private String susStopTime;

    /**
     * 数据状态
     */
    @NotBlank(message = "数据状态不能为空")
    @ApiModelProperty(value = "数据状态",required = true)
    private String dataStatus;



}
