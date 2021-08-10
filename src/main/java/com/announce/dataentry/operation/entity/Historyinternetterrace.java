package com.announce.dataentry.operation.entity;

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
 * 互联网平台信息轨迹表（修改）
 * </p>
 *
 * @author sjzhao
 * @since 2021-08-07
 */
@Data
@TableName(value = "historyinternetterrace")
@Accessors(chain = true)
public class Historyinternetterrace implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("RecordTime")
    private Date RecordTime;

    @TableField("oldSerialNo")
    private String oldSerialNo;

    @TableId(value = "SerialNo", type = IdType.AUTO)
    private String SerialNo;

    @TableField("HistorySerialNo")
    private String HistorySerialNo;

    @TableField("InternetInformationNo")
    private String InternetInformationNo;

    @TableField("TerraceType")
    private String TerraceType;

    @TableField("TerraceName")
    private String TerraceName;

    @TableField("TerraceSimpleName")
    private String TerraceSimpleName;

    @TableField("TerraceArea")
    private String TerraceArea;

    /**
     * 多个文件以英文";"隔开
     */
    @TableField("RecordInformation")
    private String RecordInformation;

    @TableField("PropertyCoL")
    private String PropertyCoL;

    /**
     * 多个文件以英文";"隔开
     */
    @TableField("LifeProductCoL")
    private String LifeProductCoL;

    @TableField("LifeDesignCoL")
    private String LifeDesignCoL;

    @TableField("StartTime")
    private Date StartTime;

    @TableField("EndTime")
    private Date EndTime;

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

    @TableField("IntTerValidStatus")
    private String IntTerValidStatus;

    @TableField("IntTerReverse1")
    private String IntTerReverse1;

    @TableField("IntTerReverse2")
    private String IntTerReverse2;

    @TableField("IntTerReverse3")
    private String IntTerReverse3;

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

    @TableField("terraceComName")
    private String terraceComName;

    @TableField("terraceComSimpleName")
    private String terraceComSimpleName;

    @TableField("terraceComCode")
    private String terraceComCode;


}
