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
 * 互联网保险产品信息轨迹表（修改）
 * </p>
 *
 * @author sjzhao
 * @since 2021-08-07
 */
@Data
@TableName(value = "historyinternetinsuranceproduc")
@Accessors(chain = true)
public class Historyinternetinsuranceproduc implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("oldSerialNo")
    private String oldSerialNo;

    @TableId(value = "SerialNo", type = IdType.AUTO)
    private String SerialNo;

    @TableField("HistorySerialNo")
    private String HistorySerialNo;

    @TableField("InternetInformationNo")
    private String InternetInformationNo;

    @TableField("InsuranceProductsName")
    private String InsuranceProductsName;

    @TableField("SaleName")
    private String SaleName;

    @TableField("RecordID")
    private String RecordID;

    @TableField("RecordName")
    private String RecordName;

    /**
     * 多个文件以英文";"隔开
     */
    @TableField("ClauseRatePDFName")
    private String ClauseRatePDFName;

    @TableField("OldClauseRatePDFName")
    private String OldClauseRatePDFName;

    /**
     * 多个文件以英文";"隔开
     */
    @TableField("ApprovalNumber")
    private String ApprovalNumber;

    @TableField("FileNumber")
    private String FileNumber;

    @TableField("TermsEncoding")
    private String TermsEncoding;

    @TableField("SalesArea")
    private String SalesArea;

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

    @TableField("IntInsValidStatus")
    private String IntInsValidStatus;

    @TableField("IntInsReverse1")
    private String IntInsReverse1;

    @TableField("IntInsReverse2")
    private String IntInsReverse2;

    @TableField("IntInsReverse3")
    private String IntInsReverse3;

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

    @TableField("oldHistorySerialNo")
    private String oldHistorySerialNo;

    @TableField("SaleNameNo")
    private String SaleNameNo;

    @TableField("RecordNameNo")
    private String RecordNameNo;

    @TableField("ProductsClass")
    private String ProductsClass;

    @TableField("TermsInEncoding")
    private String TermsInEncoding;

    @TableField("ProdRegNo")
    private String ProdRegNo;


}
