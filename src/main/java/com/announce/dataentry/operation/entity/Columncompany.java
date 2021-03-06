package com.announce.dataentry.operation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 机构目录库
 * </p>
 *
 * @author sjzhao
 * @since 2021-08-07
 */
@Data
@TableName(value = "columncompany")
@Accessors(chain = true)
public class Columncompany implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ColumnId", type = IdType.AUTO)
    private String ColumnId;

    @TableField("ComCode")
    private String ComCode;

    @TableField("ColumnName")
    private String ColumnName;

    @TableField("ComSwitchStatus")
    private String ComSwitchStatus;

    @TableField("CommUserCode")
    private String CommUserCode;

    @TableField("UserName")
    private String UserName;

    @TableField("ManagerUserCode")
    private String ManagerUserCode;

    @TableField("ManagerName")
    private String ManagerName;

    @TableField("CnSimpleName")
    private String CnSimpleName;

    @TableField("EnSimpleName")
    private String EnSimpleName;

    @TableField("ValidStatus")
    private String ValidStatus;

    @TableField("Reverse1")
    private String Reverse1;

    @TableField("Reverse2")
    private String Reverse2;

    @TableField("Reverse3")
    private String Reverse3;

    @TableField("RevokeSwitchStatus")
    private String RevokeSwitchStatus;


}
