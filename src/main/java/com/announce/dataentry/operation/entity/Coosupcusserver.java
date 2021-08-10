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
@TableName(value = "coosupcusserver")
@Accessors(chain = true)
public class Coosupcusserver implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SerialNo", type = IdType.AUTO)
    private String SerialNo;

    @TableField("OldSerialNo")
    private String OldSerialNo;

    @TableField("InternetInformationNo")
    private String InternetInformationNo;

    @TableField("CSFullName")
    private String CSFullName;

    @TableField("CSSimpleName")
    private String CSSimpleName;

    @TableField("DeskArea")
    private String DeskArea;

    @TableField("Phone")
    private String Phone;

    @TableField("BusStartTime")
    private Date BusStartTime;

    @TableField("BusStopTime")
    private Date BusStopTime;

    @TableField("PubNo")
    private String PubNo;

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
