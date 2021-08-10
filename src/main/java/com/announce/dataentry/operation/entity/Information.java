package com.announce.dataentry.operation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *披露信息表
 * @author sjzhao
 * @since 2021-08-07
 */
@Data
@TableName(value = "information")
@Accessors(chain = true)
public class Information implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "InformationNo", type = IdType.AUTO)
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
     * 澶氫釜鏂囦欢浠ヨ嫳鏂�";"闅斿紑
     */
    @TableField("PdfNames")
    private String PdfNames;

    @TableField("OldZipName")
    private String OldZipName;

    /**
     * 澶氫釜鏂囦欢浠ヨ嫳鏂�";"闅斿紑
     */
    @TableField("OldPdfNames")
    private String OldPdfNames;

    @TableField("Content")
    private String Content;

    @TableField("AddUserCode")
    private String AddUserCode;

    @TableField("AddComCode")
    private String AddComCode;

    /**
     * 绮剧‘鍒扮
     */
    @TableField("AddTime")
    private Date AddTime;

    @TableField("ModUserCode")
    private String ModUserCode;

    @TableField("ModComCode")
    private String ModComCode;

    /**
     * 绮剧‘鍒扮
     */
    @TableField("ModTime")
    private Date ModTime;

    /**
     * 绮剧‘鍒扮
     */
    @TableField("PubTime")
    private Date PubTime;

    /**
     * 绮剧‘鍒扮
     */
    @TableField("ValidEndTime")
    private Date ValidEndTime;

    /**
     * 00 - 鍏砛r
            01 - 寮�
     */
    @TableField("RemindSwitch")
    private String RemindSwitch;

    /**
     * 01 - 寰呬笂浼燶r
            02 - 鍏徃绠＄悊鍛樺鏍镐腑
            03 - 鏍忕洰绠＄悊鍛樺鏍镐腑
            04 - 淇濈洃绠＄悊鍛樺垵瀹′腑
            05 - 淇濈洃绠＄悊鍛樼粓瀹′腑
            06 - 瀹℃牳涓嶉�氳繃
            07 - 宸插彂甯僜r
            08 - 鎾ら攢
     */
    @TableField("InformationStatus")
    private String InformationStatus;

    @TableField("StatusReason")
    private String StatusReason;

    /**
     * 00 - 鏃犳晥
            01 - 鏈夋晥
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

    @TableField("applyRevokeUserCode")
    private String applyRevokeUserCode;

    @TableField("applyRevokeUserName")
    private String applyRevokeUserName;

    @TableField("applyRevokeComCode")
    private String applyRevokeComCode;

    @TableField("applyRevokeComName")
    private String applyRevokeComName;

    @TableField("applyRevokeTime")
    private Date applyRevokeTime;

    @TableField("applyRevokeStatus")
    private String applyRevokeStatus;

    @TableField("AuditOpinion")
    private String AuditOpinion;

    /**
     * 栏目类型
     */
    @TableField("columnType")
    private String columnType;


}
