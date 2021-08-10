package com.announce.dataentry.operation.domian.secondrequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description 合作技术支持/客户服务机构列表信息
 * @Author:sjZhao
 * @Date:2021/8/814:54
 */
@Data
public class SupServeryInfo {
    /**
     * 序号
     */
    @ApiModelProperty(value = "序号",required = true)
    private String sendSubAgencyNum;

    /**
     * 合作技术支持、客户服务机构全称
     */
    @ApiModelProperty(value = "合作技术支持、客户服务机构全称",required = true)
    private String csFullName;

    /**
     * 合作技术支持、客户服务机构简称全称
     */
    @ApiModelProperty(value = "合作技术支持、客户服务机构简称",required = true)
    private String csSimpleName;

    /**
     * 办公地址
     */
    @ApiModelProperty(value = "办公地址",required = true)
    private String deskArea;

    /**
     * 电话
     */
    @ApiModelProperty(value = "电话",required = true)
    private String phone;
    /**
     * 业务合作起始时间
     */
    @ApiModelProperty(value = "业务合作起始时间",required = true)
    private String busStartTime;
    /**
     * 业务合作终止时间
     */
    @ApiModelProperty(value = "业务合作终止时间",required = true)
    private String busStopTime;
    /**
     * 数据状态
     */
    @ApiModelProperty(value = "数据状态",required = true)
    private String dataStatus;

}
