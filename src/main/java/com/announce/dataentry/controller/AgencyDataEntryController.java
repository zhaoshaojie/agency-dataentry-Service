package com.announce.dataentry.controller;

import com.announce.dataentry.Util.MD5Util;
import com.announce.dataentry.Util.TimeUtil;
import com.announce.dataentry.config.ResponseCode;
import com.announce.dataentry.config.Result;
import com.announce.dataentry.domian.*;
import com.announce.dataentry.service.AgencyDataEntryService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Base64Utils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.print.DocFlavor;

/**
 * @Description 互联网端信息披露数据收集Controller
 * @Author:sjZhao
 * @Date:2021/8/714:24
 */
@RestController
@RequestMapping("/dataentry")
@Slf4j
public class AgencyDataEntryController {

//    机构目录库传输接口	localhost:7080/front/sendAgencyInfo
//    披露机构基本信息传输接口	localhost:7080/front/sendCompanyInfo
//    二级分公司（落地服务机构）新增接口	localhost:7080/front/secondCompanyInfo
//    自营平台销售互联网保险产品新增接口	localhost:7080/front/sendProductInfo
//    转委托机构详情新增/修改接口	localhost:7080/front/sendSubAgencyInfo
//    合作技术支持、客户服务机构列表新增/修改接口	localhost:7080/front/sendSupCusServeryInfo
//    二级分公司、落地服务机构、自营平台、转委托机构、合作技术支持、客户服务机构置为历史接口
//    localhost:7080/front/sendSetHistorynfo

    @Resource
    private AgencyDataEntryService agencyDataEntryService;

    /**
     * 二级分公司、落地服务机构、自营平台、转委托机构、合作技术支持、客户服务机构置为历史接口
     * @param sendSetHistoryRequestVo
     * @return
     */
    @RequestMapping("/sendsethistorynfo")
    @ApiOperation(value = "二级分公司、落地服务机构、自营平台、转委托机构、合作技术支持、客户服务机构置为历史接口")
    public Result sendSetHistorynfo(@Validated @RequestBody SendSetHistoryRequestVo sendSetHistoryRequestVo){
        return new Result();
    }

    /**
     * 合作技术支持、客户服务机构列表新增/修改接口
     * @param sendSupCusServeryRequestVo
     * @return
     */
    @RequestMapping("/sendsupcusserveryinfo")
    @ApiOperation(value = "合作技术支持、客户服务机构列表新增/修改接口")
    public Result sendSupCusServeryInfo(@Validated @RequestBody SendSupCusServeryRequestVo sendSupCusServeryRequestVo){
        return new Result();
    }

    /**
     * 转委托机构详情新增/修改接口
     * @param sendsubAgencyRequestVo
     * @return
     */
    @RequestMapping("/sendsubagencyinfo")
    @ApiOperation(value = "转委托机构详情新增/修改接口")
    public Result sendsubAgencyinfo(@Validated @RequestBody SendsubAgencyRequestVo sendsubAgencyRequestVo){
        return new Result();
    }

    /**
     * 自营平台销售互联网保险产品新增接口
     * @param sendProductRequestVo
     * @return
     */
    @RequestMapping("/sendproductinfo")
    @ApiOperation(value = "自营平台销售互联网保险产品新增接口")
    public Result sendProductInfo(@Validated @RequestBody SendProductRequestVo sendProductRequestVo){
        return new Result();
    }

    /**
     * 二级分公司（落地服务机构）新增接口
     * @param secondCompanyRequestVo
     * @return
     */
    @RequestMapping("/secondcompanyinfo")
    @ApiOperation(value = "二级分公司（落地服务机构）新增接口")
    public Result secondCompanyInfo(@Validated @RequestBody SecondCompanyRequestVo secondCompanyRequestVo){
        return new Result();
    }

    /**
     * 披露机构基本信息传输接口
     * @param sendCompanyRequestVo
     * @return
     */
    @RequestMapping("/sendcompanyinfo")
    @ApiOperation(value = "披露机构基本信息传输接口")
    public Result sendCompanyInfo(@Validated @RequestBody SendCompanyRequestVo sendCompanyRequestVo){
        return new Result();
    }

    /**
     * 机构目录库传输接口
     * @param sendAgencyRequestVo
     * @return
     */
    @RequestMapping("/sendagencyinfo")
    @ApiOperation(value = "机构目录库传输接口")
    public Result sendAgencyInfo(@Validated @RequestBody SendAgencyRequestVo sendAgencyRequestVo) {
        boolean flag = agencyDataEntryService.verifyUserInfo(String.valueOf(sendAgencyRequestVo.getTkey()), sendAgencyRequestVo.getX_Auth_Token());
        if(!flag){
            return Result.failure(ResponseCode.ERROR_1002,"身份验证失败");
        }
        return null;
    }
}
