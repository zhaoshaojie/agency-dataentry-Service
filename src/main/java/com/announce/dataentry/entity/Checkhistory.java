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
 * 
 * </p>
 *
 * @author sjzhao
 * @since 2021-08-07
 */
@Data
@TableName(value = "checkhistory")
@Accessors(chain = true)
public class Checkhistory implements Serializable {

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

    /**
     * 多个文件以英文";"隔开
     */
    @TableField("PdfNames")
    private String PdfNames;

    @TableField("OldZipName")
    private String OldZipName;

    /**
     * 多个文件以英文";"隔开
     */
    @TableField("OldPdfNames")
    private String OldPdfNames;

    @TableField("Content")
    private String Content;

    @TableField("ComCode")
    private String ComCode;

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
     * 精确到秒
     */
    @TableField("PubTime")
    private Date PubTime;

    /**
     * 精确到秒
     */
    @TableField("ValidEndTime")
    private Date ValidEndTime;

    /**
     * 00 - 开
            01 - 关
     */
    @TableField("RemindSwitch")
    private String RemindSwitch;

    /**
     * 01 - 待上传
            02 - 公司管理员审核中
            03 - 栏目管理员审核中
            04 - 保监管理员初审中
            05 - 保监管理员终审中
            06 - 审核不通过
            07 - 已发布
            08 - 撤销
     */
    @TableField("InformationStatus")
    private String InformationStatus;

    @TableField("StatusReason")
    private String StatusReason;

    /**
     * 00 - 无效
            01 - 有效
     */
    @TableField("InfoValidStatus")
    private String InfoValidStatus;

    @TableField("UserComCode")
    private String UserComCode;

    @TableField("UserCode")
    private String UserCode;

    /**
     * 01 - 上传成功
            02 - 公司审核通过
            03 - 公司审核不通过
            04 - 栏目审核通过
            05 - 栏目审核不通过
            06 - 保监初审通过
            07 - 保监初审不通过
            08 - 保监终审通过
            09 - 保监终审不通过
            10 - 发布成功
            11 - 撤销成功
     */
    @TableField("CheckResult")
    private String CheckResult;

    /**
     * 精确到秒
     */
    @TableField("CheckTime")
    private Date CheckTime;

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

    @TableField("updateStatus")
    private String updateStatus;

    @TableField("InfoReverse1")
    private String InfoReverse1;

    @TableField("InfoReverse2")
    private String InfoReverse2;

    @TableField("InfoReverse3")
    private String InfoReverse3;

    @TableField("BatchNumber")
    private String BatchNumber;

    @TableField("UserComName")
    private String UserComName;

    @TableField("UserName")
    private String UserName;

    @TableField("AuditOpinion")
    private String AuditOpinion;

    /**
     * 栏目类型
     */
    @TableField("columnType")
    private String columnType;


}
