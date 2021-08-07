package com.announce.dataentry.entity;

import com.baomidou.mybatisplus.annotation.IdType;

import java.io.Serializable;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
@TableName(value = "auditorrevokeinfo")
@Accessors(chain = true)
public class Auditorrevokeinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SerialNo", type = IdType.AUTO)
    private String SerialNo;

    @TableField("InformationNo")
    private String InformationNo;

    @TableField("AuditComment")
    private String AuditComment;

    @TableField("AuditRevUserCode")
    private String AuditRevUserCode;

    @TableField("AuditRevUserName")
    private String AuditRevUserName;

    @TableField("AuditRevComCode")
    private String AuditRevComCode;

    @TableField("AuditRevComName")
    private String AuditRevComName;

    @TableField("AuditRevComType")
    private String AuditRevComType;

    @TableField("AuditRevTime")
    private Date AuditRevTime;

    @TableField("OptionResult")
    private String OptionResult;

    @TableField("ValidStatus")
    private String ValidStatus;

    @TableField("Reverse1")
    private String Reverse1;

    @TableField("Reverse2")
    private String Reverse2;

    @TableField("Reverse3")
    private String Reverse3;


}
