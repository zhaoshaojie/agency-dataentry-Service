package com.announce.dataentry.entity;

import com.baomidou.mybatisplus.annotation.IdType;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 二级分公司表
 * </p>
 *
 * @author sjzhao
 * @since 2021-08-07
 */
@Data
@TableName(value = "twosyscompany")
@Accessors(chain = true)
public class Twosyscompany implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("oldSerialNo")
    private String oldSerialNo;

    @TableId(value = "SerialNo", type = IdType.AUTO)
    private String SerialNo;

    @TableField("InternetInformationNo")
    private String InternetInformationNo;

    @TableField("TwoComName")
    private String TwoComName;

    @TableField("DeskArea")
    private String DeskArea;

    @TableField("Phone")
    private String Phone;

    @TableField("CnForeignType")
    private String CnForeignType;

    /**
     * 多个文件以英文";"隔开
     */
    @TableField("BusAreaRange")
    private String BusAreaRange;

    @TableField("registAreaCode")
    private String registAreaCode;

    /**
     * 多个文件以英文";"隔开
     */
    @TableField("BusRange")
    private String BusRange;

    /**
     * 00 - 旧
            01 - 新
     */
    @TableField("InternetState")
    private String InternetState;

    @TableField("AddUserCode")
    private String AddUserCode;

    @TableField("AddComCode")
    private String AddComCode;

    /**
     * 精确到秒
     */
    @TableField("AddTime")
    private Date AddTime;

    @TableField("ModUserCode")
    private String ModUserCode;

    @TableField("ModComCode")
    private String ModComCode;

    /**
     * 精确到秒
     */
    @TableField("ModTime")
    private Date ModTime;

    /**
     * 00 - 无效
            01 - 有效
            
     */
    @TableField("PubNo")
    private String PubNo;

    /**
     * 00 - 无效
            01 - 有效
     */
    @TableField("ValidStatus")
    private String ValidStatus;

    @TableField("Reverse1")
    private String Reverse1;

    @TableField("Reverse2")
    private String Reverse2;

    @TableField("Reverse3")
    private String Reverse3;

    @TableField("operateStatus")
    private String operateStatus;


}
