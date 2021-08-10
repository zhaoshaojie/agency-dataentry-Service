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
 * 转委托机构轨迹表（新增）
 * </p>
 *
 * @author sjzhao
 * @since 2021-08-07
 */
@Data
@TableName(value = "historysubagency")
@Accessors(chain = true)
public class Historysubagency implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SerialNo", type = IdType.AUTO)
    private String SerialNo;

    @TableField("OldSerialNo")
    private String OldSerialNo;

    @TableField("InternetInformationNo")
    private String InternetInformationNo;

    @TableField("SubAgencyFullName")
    private String SubAgencyFullName;

    @TableField("SubAgencySimpleName")
    private String SubAgencySimpleName;

    @TableField("BusStartTime")
    private Date BusStartTime;

    @TableField("BusStopTime")
    private Date BusStopTime;

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
