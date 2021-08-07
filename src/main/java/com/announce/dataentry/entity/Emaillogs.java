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
@TableName(value = "emaillogs")
@Accessors(chain = true)
public class Emaillogs implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SerialNo", type = IdType.AUTO)
    private String SerialNo;

    @TableField("InformationNo")
    private String InformationNo;

    @TableField("SendUserCode")
    private String SendUserCode;

    @TableField("SendUserName")
    private String SendUserName;

    @TableField("SendComCode")
    private String SendComCode;

    @TableField("SendComName")
    private String SendComName;

    @TableField("SendEmailAddress")
    private String SendEmailAddress;

    @TableField("SendTime")
    private Date SendTime;

    @TableField("EmailContent")
    private String EmailContent;

    @TableField("ReceiveUserCode")
    private String ReceiveUserCode;

    @TableField("ReceiveUserName")
    private String ReceiveUserName;

    @TableField("ReceiveComCode")
    private String ReceiveComCode;

    @TableField("ReceiveComName")
    private String ReceiveComName;

    @TableField("ReceiveEmailAddress")
    private String ReceiveEmailAddress;

    @TableField("SendStatus")
    private String SendStatus;

    @TableField("ErrorMessage")
    private String ErrorMessage;

    @TableField("ValidStatus")
    private String ValidStatus;

    @TableField("Reverse1")
    private String Reverse1;

    @TableField("Reverse2")
    private String Reverse2;

    @TableField("Reverse3")
    private String Reverse3;


}
