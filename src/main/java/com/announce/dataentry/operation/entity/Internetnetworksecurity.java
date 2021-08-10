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
 * 互联网网安情况表（新增）
 * </p>
 *
 * @author sjzhao
 * @since 2021-08-07
 */
@Data
@TableName(value = "internetnetworksecurity")
@Accessors(chain = true)
public class Internetnetworksecurity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SerialNo", type = IdType.AUTO)
    private String SerialNo;

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

    @TableField("AddUserCode")
    private String AddUserCode;

    @TableField("AddComCode")
    private String AddComCode;

    @TableField("AddTime")
    private Date AddTime;

    @TableField("ModUserCode")
    private String ModUserCode;

    @TableField("ModComCode")
    private String ModComCode;

    @TableField("ModTime")
    private Date ModTime;

    @TableField("ValidStatus")
    private String ValidStatus;

    @TableField("operateStatus")
    private String operateStatus;

    @TableField("Reverse1")
    private String Reverse1;

    @TableField("Reverse2")
    private String Reverse2;

    @TableField("Reverse3")
    private String Reverse3;


}
