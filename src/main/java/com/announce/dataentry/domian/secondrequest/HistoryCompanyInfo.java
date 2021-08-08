package com.announce.dataentry.domian.secondrequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @Description 二级分公司、落地服务机构、自营平台、转委托机构、合作技术支持、客户服务机构中历史产品数据信息
 * @Author:sjZhao
 * @Date:2021/8/814:10
 */
@Data
public class HistoryCompanyInfo {

    /**
     * 变更模块类型
     * 1-二级分公司
     * 2-落地服务机构
     * 3-自营平台
     * 4-自营平台产品
     * 5-转委托机构
     * 6-合作技术支持、客户服务机构
     */
    @NotBlank(message = "变更模块类型不能为空")
    @ApiModelProperty(value = "变更模块类型",required = true)
    private String setHistoryType;

    /**
     * 数据唯一性标识
     * 二级分公司、落地服务机构、自营平台、转委托机构、合作技术支持、客户服务机构数据唯一标识
     */
    @NotBlank(message = "数据唯一性标识不能为空")
    @ApiModelProperty(value = "数据唯一性标识",required = true)
    private String setHistoryNum;

    /**
     * 需置为历史的产品需要集合  互联网保险产品集合
     */
    @NotBlank(message = "互联网保险产品集合不能为空")
    @ApiModelProperty(value = "互联网保险产品集合",required = true)
    private List<String> setProList;

    /**
     *  数据状态 1-新增  2-修改
     */
    @NotBlank(message = "数据状态不能为空")
    @ApiModelProperty(value = "数据状态",required = true)
    private String dataStatus;
}
