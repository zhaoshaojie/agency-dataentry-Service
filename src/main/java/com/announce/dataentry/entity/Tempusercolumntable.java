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
 * 临时用户所属栏目表（新增）
 * </p>
 *
 * @author sjzhao
 * @since 2021-08-07
 */
@Data
@TableName(value = "tempusercolumntable")
@Accessors(chain = true)
public class Tempusercolumntable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SeriNo", type = IdType.AUTO)
    private String SeriNo;

    @TableField("UserCode")
    private String UserCode;

    @TableField("ColumnId")
    private String ColumnId;

    @TableField("ColumnName")
    private String ColumnName;

    @TableField("ColumnBelonging")
    private String ColumnBelonging;

    @TableField("TempUserPassword")
    private String TempUserPassword;

    @TableField("BatchNumber")
    private String BatchNumber;

    @TableField("UseState")
    private String UseState;

    @TableField("AddTime")
    private Date AddTime;

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


}
