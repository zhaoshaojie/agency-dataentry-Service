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
 * 系统机构表
 * </p>
 *
 * @author sjzhao
 * @since 2021-08-07
 */
@Data
@TableName(value = "syscompany")
@Accessors(chain = true)
public class Syscompany implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("EnFullName")
    private String EnFullName;

    @TableId(value = "ComCode", type = IdType.AUTO)
    private String ComCode;

    @TableField("CnFullName")
    private String CnFullName;

    /**
     * 1 - 省级
            2 - 市级
            3 - 县级
     */
    @TableField("CnSimpleName")
    private String CnSimpleName;

    /**
     * 01 - 保监局
            02 - 保险协会
            03 - 保险公司
            04 - 中介代理
     */
    @TableField("EnSimpleName")
    private String EnSimpleName;

    /**
     * 默认一个代码
            
     */
    @TableField("AreaCode")
    private String AreaCode;

    /**
     * 1 - 省级
            2 - 市级
            3 - 县级
            默认一个级别1
            
     */
    @TableField("ComLevel")
    private Integer ComLevel;

    /**
     * 当添加保险公司的时候，该字段存放系统代码表中的保险公司代码前缀（如：PICC），当添加中介机构的时候，该字段存放机构类别为中介机构的最上级机构代码。
            01 - 保监局
            02 - 保险协会
            03 - 保险公司
            
     */
    @TableField("ComType")
    private String ComType;

    /**
     * 01 - 集团公司（控股公司）
            02 - 财产险公司
            03 - 人身险公司
            04 - 资产管理公司
            05 - 再保险公司
            06 - 地方协会
            07 - 保险代理公司
            08 - 保险公估公司
            09 - 保险经纪公司
            10 - 相关机构
     */
    @TableField("BxComType")
    private String BxComType;

    @TableField("CnForeignType")
    private String CnForeignType;

    @TableField("BusAreaRange")
    private String BusAreaRange;

    /**
     * 录入值后不允许修改
     */
    @TableField("registAreaCode")
    private String registAreaCode;

    @TableField("BusRange")
    private String BusRange;

    @TableField("ManagerUserCode")
    private String ManagerUserCode;

    /**
     * 默认一个代码
     */
    @TableField("SupComCode")
    private String SupComCode;

    /**
     * 默认一个代码
            00 - 无
            01 - 有
            
     */
    @TableField("HasSubCom")
    private String HasSubCom;

    @TableField("ComAddress")
    private String ComAddress;

    @TableField("ComPhone")
    private String ComPhone;

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

    @TableField("SERIALNO")
    private String serialno;


}
