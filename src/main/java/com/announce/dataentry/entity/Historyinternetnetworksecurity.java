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
 * 互联网网安情况轨迹表（新增)
 * </p>
 *
 * @author sjzhao
 * @since 2021-08-07
 */
@Data
@TableName(value = "historyinternetnetworksecurity")
@Accessors(chain = true)
public class Historyinternetnetworksecurity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SerialNo", type = IdType.AUTO)
    private String SerialNo;

    @TableField("OldSerialNo")
    private String OldSerialNo;

    @TableField("InternetInformationNo")
    private String InternetInformationNo;

    @TableField("GradeLevel")
    private String GradeLevel;

    @TableField("AuditDate")
    private Date AuditDate;

    @TableField("GradeCertification")
    private String GradeCertification;

    @TableField("GradeCertificationName")
    private String GradeCertificationName;

    @TableField("InternetState")
    private String InternetState;

    @TableField("PubNo")
    private String PubNo;

    @TableField("ValidStatus")
    private String ValidStatus;

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

    @TableField("operateStatus")
    private String operateStatus;

    @TableField("Reverse1")
    private String Reverse1;

    @TableField("Reverse2")
    private String Reverse2;

    @TableField("Reverse3")
    private String Reverse3;


}
