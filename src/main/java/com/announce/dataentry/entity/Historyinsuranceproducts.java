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
 * 合作平台保险产品轨迹表（修改）
 * </p>
 *
 * @author sjzhao
 * @since 2021-08-07
 */
@Data
@TableName(value = "historyinsuranceproducts")
@Accessors(chain = true)
public class Historyinsuranceproducts implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("oldSerialNo")
    private String oldSerialNo;

    @TableId(value = "SerialNo", type = IdType.AUTO)
    private String SerialNo;

    @TableField("HistorySerialNo")
    private String HistorySerialNo;

    @TableField("InternetInformationNo")
    private String InternetInformationNo;

    @TableField("TerraceNo")
    private String TerraceNo;

    @TableField("InternetName")
    private String InternetName;

    @TableField("InternetbjName")
    private String InternetbjName;

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

    @TableField("OperateTime")
    private Date OperateTime;

    @TableField("InsProValidStatus")
    private String InsProValidStatus;

    @TableField("InsProReverse1")
    private String InsProReverse1;

    @TableField("InsProReverse2")
    private String InsProReverse2;

    @TableField("InsProReverse3")
    private String InsProReverse3;

    @TableField("BatchNumber")
    private String BatchNumber;

    @TableField("OperateUserCode")
    private String OperateUserCode;

    @TableField("OperateUserName")
    private String OperateUserName;

    @TableField("OperateComCode")
    private String OperateComCode;

    @TableField("OperateComName")
    private String OperateComName;

    @TableField("OperateType")
    private String OperateType;

    @TableField("DisplayStatus")
    private String DisplayStatus;

    @TableField("RecordNo")
    private String RecordNo;

    @TableField("PlatformClass")
    private String PlatformClass;


}
