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
 * 
 * </p>
 *
 * @author sjzhao
 * @since 2021-08-07
 */
@Data
@TableName(value = "applayrevokeinfo")
@Accessors(chain = true)
public class Applayrevokeinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SerialNo", type = IdType.AUTO)
    private String SerialNo;

    @TableField("InformationNo")
    private String InformationNo;

    @TableField("ColumnId")
    private String ColumnId;

    @TableField("InstitutionCode")
    private String InstitutionCode;

    @TableField("TitleName")
    private String TitleName;

    @TableField("ZipName")
    private String ZipName;

    @TableField("PdfNames")
    private String PdfNames;

    @TableField("OldZipName")
    private String OldZipName;

    @TableField("OldPdfNames")
    private String OldPdfNames;

    @TableField("AddUserCode")
    private String AddUserCode;

    @TableField("AddComCode")
    private String AddComCode;

    @TableField("AddTime")
    private Date AddTime;

    @TableField("PubTime")
    private Date PubTime;

    @TableField("AuditStatus")
    private String AuditStatus;

    @TableField("ApplyRevUserCode")
    private String ApplyRevUserCode;

    @TableField("ApplyRevUserName")
    private String ApplyRevUserName;

    @TableField("ApplyRevComCode")
    private String ApplyRevComCode;

    @TableField("ApplyRevComName")
    private String ApplyRevComName;

    @TableField("ApplyRevTime")
    private Date ApplyRevTime;

    @TableField("ValidStatus")
    private String ValidStatus;

    @TableField("Reverse1")
    private String Reverse1;

    @TableField("Reverse2")
    private String Reverse2;

    @TableField("Reverse3")
    private String Reverse3;

    @TableField("ApplyRevReason")
    private String ApplyRevReason;

    @TableField("ApplyRevOldFileName")
    private String ApplyRevOldFileName;

    @TableField("ApplyRevNewFileName")
    private String ApplyRevNewFileName;

    @TableField("OptionTime")
    private Date OptionTime;


}
