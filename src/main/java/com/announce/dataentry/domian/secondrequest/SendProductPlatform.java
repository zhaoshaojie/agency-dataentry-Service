package com.announce.dataentry.domian.secondrequest;

import com.announce.dataentry.domian.thirdrequest.ProductInfo;
import lombok.Data;

import java.util.List;

/**
 * @Description 自营平台信息
 * @Author:sjZhao
 * @Date:2021/8/813:41
 */
@Data
public class SendProductPlatform {

    /**
     * 自营平台唯一标识
     */
    private String platformNum;

    /**
     * 产品信息
     */
    private List<ProductInfo> productList;

    /**
     * 数据状态 1--新增   2--修改
     */
    private String dataStatus;

}
