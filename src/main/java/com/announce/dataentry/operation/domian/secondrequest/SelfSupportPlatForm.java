package com.announce.dataentry.operation.domian.secondrequest;

import lombok.Data;

/**
 * @Description 自营网路平台信息
 * @Author:sjZhao
 * @Date:2021/8/721:57
 */
@Data
public class SelfSupportPlatForm {


    /**
     * 平台类别
     * 1-网站
     * 2-移动应用程序（APP）
     * 3-互联网用户公众号
     * 4-互联网平台小程序
     * 5-电商平台门店
     * 6-其他
     */
    private String PlatformType;

    /**
     * 平台名称
     */
    private String PlatformName;

    /**
     * 平台地址
     */
    private String platformLink;

    /**
     * ICP备案号
     */
    private String platformIcpNum;

    /**
     * 自营网络平台唯一标识
     */
    private String platformNum;

}
