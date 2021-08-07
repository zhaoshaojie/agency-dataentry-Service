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
 * 互联网披露信息表
 * </p>
 *
 * @author sjzhao
 * @since 2021-08-07
 */
@Data
@TableName(value = "internetinformation")
@Accessors(chain = true)
public class Internetinformation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("registeredCapital")
    private String registeredCapital;

    @TableField("registAreaCode")
    private String registAreaCode;

    @TableField("SettingTime")
    private Date SettingTime;

    @TableField("CompanyArea")
    private String CompanyArea;

    @TableField("Phone")
    private String Phone;

    @TableId(value = "SerialNo", type = IdType.AUTO)
    private String SerialNo;

    @TableField("InternetInformationNo")
    private String InternetInformationNo;

    @TableField("ColumnId")
    private String ColumnId;

    @TableField("CnFullName")
    private String CnFullName;

    @TableField("CnSimpleName")
    private String CnSimpleName;

    @TableField("InternetName")
    private String InternetName;

    @TableField("InternetArea")
    private String InternetArea;

    @TableField("InternetAppName")
    private String InternetAppName;

    /**
     * 多个文件以英文";"隔开
     */
    @TableField("InternetWeiXin")
    private String InternetWeiXin;

    @TableField("InternetPhone")
    private String InternetPhone;

    /**
     * 多个文件以英文";"隔开
     */
    @TableField("comArea")
    private String comArea;

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

    @TableField("ComInternetLink")
    private String ComInternetLink;

    @TableField("oneYearAdequacy")
    private String oneYearAdequacy;

    @TableField("oneYearIRR")
    private String oneYearIRR;

    @TableField("oneYearEvaluate")
    private String oneYearEvaluate;


}
