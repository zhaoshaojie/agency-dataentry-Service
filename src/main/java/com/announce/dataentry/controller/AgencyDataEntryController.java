package com.announce.dataentry.controller;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.announce.dataentry.Util.JSONUtil;
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
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.print.DocFlavor;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 * @Description 互联网端信息披露数据收集Controller
 * @Author:sjZhao
 * @Date:2021/8/714:24
 */
@RestController
@RequestMapping("/dataentry")
@Slf4j
public class AgencyDataEntryController {

    private static String companyType_one ="1";//中介机构
    private static String companyType_two ="2";//商业银行

    private static String dataStatus_one ="1";//新增
    private static String dataStatus_two ="2";//修改




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
     * @param data
     * @return
     */
    @RequestMapping("/sendcompanyinfo")
    @ApiOperation(value = "披露机构基本信息传输接口")
    public String sendCompanyInfo(@RequestParam("data") String data){
        SendCompanyRequestVo sendCompanyRequestVo = SendCompanyRequestVo.builder().build();
        try {
            String entrance = new String(Base64Utils.decodeFromString(data),"utf-8");
            sendCompanyRequestVo = (SendCompanyRequestVo)JSONUtil.fromJson(entrance,SendCompanyRequestVo.class);
        } catch (Exception e){
            log.error("传输数据解析失败",e);
            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1001,"入参异常，校验失败"));
        }
        //参数非空校验
        if(sendCompanyRequestVo.checkData() != null){
            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1001,"入参校验失败"));
        }
        //用户身份校验
        boolean flag = agencyDataEntryService.verifyUserInfo(String.valueOf(sendCompanyRequestVo.getTkey()), sendCompanyRequestVo.getX_Auth_Token());
        if(!flag){
            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1002,"身份验证失败"));
        }
        //业务逻辑处理
        Result result = new Result();
        return JSONUtil.toJson(result);
    }

    /**
     * 机构目录库传输接口
     * @param data
     * @return
     */
    @GetMapping("/sendagencyinfo")
    @ApiOperation(value = "机构目录库传输接口")
    public String  sendAgencyInfo( @RequestParam("data") String data) {
        SendAgencyRequestVo sendAgencyRequestVo = SendAgencyRequestVo.builder().build();
        try {
            String entrance = new String(Base64Utils.decodeFromString(data),"utf-8");
            sendAgencyRequestVo = (SendAgencyRequestVo)JSONUtil.fromJson(entrance,SendAgencyRequestVo.class);
        } catch (Exception e){
            log.error("传输数据解析失败",e);
            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1001,"入参异常，校验失败"));
        }
        //参数非空校验
        if(sendAgencyRequestVo.checkData() != null){
            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1001,"入参校验失败"));
        }
        //用户身份校验
        boolean flag = agencyDataEntryService.verifyUserInfo(String.valueOf(sendAgencyRequestVo.getTkey()), sendAgencyRequestVo.getX_Auth_Token());
        if(!flag){
            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1002,"身份验证失败"));
        }
        Result result = agencyDataEntryService.sendAgencyInfo(sendAgencyRequestVo);
        return JSONUtil.toJson(result);
    }


    /**
     * 组装数据
     * @return
     */
    @GetMapping("/testinfo")
    @ApiOperation(value = "组装数据")
    public String  testInfo( ) throws UnsupportedEncodingException {
        String username ="zhansan";
        String password = "123456";
        //当前时间，格式 yyyy-MM-dd HH:mm:ss
        String requestTime = DateUtil.now();
        //时间戳
        long tKey = DateUtil.current(true);
        String companyCode ="111111";
        String companyType = companyType_one;
        String dataStatus = dataStatus_one;
        //使用MD5加密password，以tKey为salt，结果用base64转化。
        String token = MD5Util.GetMD5Code(password+tKey);
        token = Base64Utils.encodeToString(token.getBytes("utf-8"));
        SendAgencyRequestVo sendAgencyRequestVo = SendAgencyRequestVo.builder()
                                                    .username(username)
                                                    .requestTime(requestTime)
                                                    .companyCode(companyCode)
                                                    .companyName(companyCode)
                                                    .dataStatus(dataStatus)
                                                    .x_Auth_Token(token)
                                                    .tkey(tKey)
                                                    .companyType(companyType).build();
        String data =  Base64Utils.encodeToString(JSONUtil.toJson(sendAgencyRequestVo).getBytes());
        return data;
    }


}
