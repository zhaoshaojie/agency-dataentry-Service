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
@TableName(value = "sysuser")
@Accessors(chain = true)
public class Sysuser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "UserCode", type = IdType.AUTO)
    private String UserCode;

    @TableField("ComCode")
    private String ComCode;

    /**
     * 00 - 是
            01 - 否
            
     */
    @TableField("isManager")
    private String isManager;

    @TableField("UserName")
    private String UserName;

    @TableField("PassWord")
    private String PassWord;

    @TableField("TelePhone")
    private String TelePhone;

    @TableField("Phone")
    private String Phone;

    @TableField("DepartmentName")
    private String DepartmentName;

    @TableField("Position")
    private String Position;

    @TableField("Email")
    private String Email;

    @TableField("Qq")
    private String Qq;

    @TableField("WeiXinNo")
    private String WeiXinNo;

    @TableField("Reverse")
    private String Reverse;

    /**
     * 01 - 页面系统用户
            02 - 数据系统用户
     */
    @TableField("UserType")
    private String UserType;

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

    @TableField("AddUserCode")
    private String AddUserCode;

    @TableField("AddUserName")
    private String AddUserName;

    @TableField("AddComCode")
    private String AddComCode;

    @TableField("AddComName")
    private String AddComName;

    @TableField("AddTime")
    private Date AddTime;


}
