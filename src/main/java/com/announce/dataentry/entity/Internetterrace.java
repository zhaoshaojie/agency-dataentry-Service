package com.announce.dataentry.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 互联网平台信息表
 * </p>
 *
 * @author sjzhao
 * @since 2021-08-07
 */
@Data
@TableName(value = "internetterrace")
@Accessors(chain = true)
public class Internetterrace implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("RecordTime")
    private Date RecordTime;

    @TableField("oldSerialNo")
    private String oldSerialNo;

    @TableId(value = "SerialNo", type = IdType.AUTO)
    private String SerialNo;

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

    @TableField("operateStatus")
    private String operateStatus;

    @TableField("terraceComName")
    private String terraceComName;

    @TableField("terraceComSimpleName")
    private String terraceComSimpleName;

    @TableField("terraceComCode")
    private String terraceComCode;


}
