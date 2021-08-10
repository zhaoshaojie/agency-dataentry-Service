package com.announce.dataentry.operation.controller;

import cn.hutool.core.date.DateUtil;
import com.announce.dataentry.Util.JSONUtil;
import com.announce.dataentry.Util.MD5Util;
import com.announce.dataentry.config.ResponseCode;
import com.announce.dataentry.config.Result;
import com.announce.dataentry.operation.domian.*;
import com.announce.dataentry.operation.service.AgencyDataEntryService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;

/**
 * @Description 互联网端信息披露数据收集Controller
 * @Author:sjZhao
 * @Date:2021/8/714:24
 */
@RestController
@RequestMapping("/dataentry")
@Slf4j
public class AgencyDataEntryController {

    @Resource
    private AgencyDataEntryService agencyDataEntryService;

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


    /**
     * 二级分公司、落地服务机构、自营平台、转委托机构、合作技术支持、客户服务机构置为历史接口
     * @param requestData
     * @return
     */
    @RequestMapping("/sendsethistoryinfo")
    @ApiOperation(value = "二级分公司、落地服务机构、自营平台、转委托机构、合作技术支持、客户服务机构置为历史接口")
    public String sendSetHistoryInfo(@RequestParam("requestData")  String requestData) {
        SendSetHistoryRequestVo sendSetHistoryRequestVo = SendSetHistoryRequestVo.builder().build();
        try {
            String entrance = new String(Base64Utils.decodeFromString(requestData), "utf-8");
            sendSetHistoryRequestVo = (SendSetHistoryRequestVo) JSONUtil.fromJson(entrance, SendSetHistoryRequestVo.class);
        } catch (Exception e) {
            log.error("传输数据解析失败", e);
            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1001, "入参异常，校验失败"));
        }
        //参数非空校验
//        if (sendSetHistoryRequestVo.checkData() != null) {
//            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1001, "入参校验失败"));
//        }
        //用户身份校验
        boolean flag = agencyDataEntryService.verifyUserInfo(sendSetHistoryRequestVo.getUsername(),
                String.valueOf(sendSetHistoryRequestVo.getTkey()), sendSetHistoryRequestVo.getX_Auth_Token());
        if (!flag) {
            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1002, "身份验证失败"));
        }
        //业务逻辑处理
        Result result = Result.failure("000", "111");
        return JSONUtil.toJson(result);
    }

    /**
     * 合作技术支持、客户服务机构列表新增/修改接口
     * @param requestData
     * @return
     */
    @RequestMapping("/sendsupcusserveryinfo")
    @ApiOperation(value = "合作技术支持、客户服务机构列表新增/修改接口")
    public String sendSupCusServeryInfo(@RequestParam("requestData")  String requestData) {
        SendSupCusServeryRequestVo sendSupCusServeryRequestVo = SendSupCusServeryRequestVo.builder().build();
        try {
            String entrance = new String(Base64Utils.decodeFromString(requestData), "utf-8");
            sendSupCusServeryRequestVo = (SendSupCusServeryRequestVo) JSONUtil.fromJson(entrance, SendSupCusServeryRequestVo.class);
        } catch (Exception e) {
            log.error("传输数据解析失败", e);
            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1001, "入参异常，校验失败"));
        }
        //参数非空校验
//        if (sendSupCusServeryRequestVo.checkData() != null) {
//            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1001, "入参校验失败"));
//        }
        //用户身份校验
        boolean flag = agencyDataEntryService.verifyUserInfo(sendSupCusServeryRequestVo.getUsername(),
                String.valueOf(sendSupCusServeryRequestVo.getTkey()), sendSupCusServeryRequestVo.getX_Auth_Token());
        if (!flag) {
            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1002, "身份验证失败"));
        }
        //业务逻辑处理
        Result result = Result.failure("000", "111");
        return JSONUtil.toJson(result);
    }

    /**
     * 转委托机构详情新增/修改接口
     * @param requestData
     * @return
     */
    @RequestMapping("/sendsubagencyinfo")
    @ApiOperation(value = "转委托机构详情新增/修改接口")
    public String sendsubAgencyinfo(@RequestParam("requestData")  String requestData) {
        SendsubAgencyRequestVo sendsubAgencyRequestVo = SendsubAgencyRequestVo.builder().build();
        try {
            String entrance = new String(Base64Utils.decodeFromString(requestData), "utf-8");
            sendsubAgencyRequestVo = (SendsubAgencyRequestVo) JSONUtil.fromJson(entrance, SendsubAgencyRequestVo.class);
        } catch (Exception e) {
            log.error("传输数据解析失败", e);
            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1001, "入参异常，校验失败"));
        }
        //参数非空校验
//        if (sendsubAgencyRequestVo.checkData() != null) {
//            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1001, "入参校验失败"));
//        }
        //用户身份校验
        boolean flag = agencyDataEntryService.verifyUserInfo(sendsubAgencyRequestVo.getUsername(),
                String.valueOf(sendsubAgencyRequestVo.getTkey()), sendsubAgencyRequestVo.getX_Auth_Token());
        if (!flag) {
            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1002, "身份验证失败"));
        }
        //业务逻辑处理
        Result result = Result.failure("000", "111");
        return JSONUtil.toJson(result);
    }

    /**
     * 自营平台销售互联网保险产品新增接口
     * @param requestData
     * @return
     */
    @RequestMapping("/sendproductinfo")
    @ApiOperation(value = "自营平台销售互联网保险产品新增接口")
    public String sendProductInfo(@RequestParam("requestData")  String requestData) {
        SendProductRequestVo sendProductRequestVo = SendProductRequestVo.builder().build();
        try {
            String entrance = new String(Base64Utils.decodeFromString(requestData), "utf-8");
            sendProductRequestVo = (SendProductRequestVo) JSONUtil.fromJson(entrance, SendProductRequestVo.class);
        } catch (Exception e) {
            log.error("传输数据解析失败", e);
            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1001, "入参异常，校验失败"));
        }
        //参数非空校验
//        if (sendProductRequestVo.checkData() != null) {
//            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1001, "入参校验失败"));
//        }
        //用户身份校验
        boolean flag = agencyDataEntryService.verifyUserInfo(sendProductRequestVo.getUsername(),
                String.valueOf(sendProductRequestVo.getTkey()), sendProductRequestVo.getX_Auth_Token());
        if (!flag) {
            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1002, "身份验证失败"));
        }
        //业务逻辑处理
        Result result = Result.failure("000", "111");
        return JSONUtil.toJson(result);
    }

    /**
     * 二级分公司（落地服务机构）新增接口
     * @param requestData
     * @return
     */
    @RequestMapping("/secondcompanyinfo")
    @ApiOperation(value = "二级分公司（落地服务机构）新增接口")
    public String  secondCompanyInfo(@RequestParam("requestData")  String requestData){
        SecondCompanyRequestVo secondCompanyRequestVo = SecondCompanyRequestVo.builder().build();
        try {
            String entrance = new String(Base64Utils.decodeFromString(requestData),"utf-8");
            secondCompanyRequestVo = (SecondCompanyRequestVo)JSONUtil.fromJson(entrance,SecondCompanyRequestVo.class);
        } catch (Exception e){
            log.error("传输数据解析失败",e);
            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1001,"入参异常，校验失败"));
        }
        //参数非空校验
//        if(secondCompanyRequestVo.checkData() != null){
//            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1001,"入参校验失败"));
//        }
        //用户身份校验
        boolean flag = agencyDataEntryService.verifyUserInfo(secondCompanyRequestVo.getUsername(),
                String.valueOf(secondCompanyRequestVo.getTkey()), secondCompanyRequestVo.getX_Auth_Token());
        if(!flag){
            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1002,"身份验证失败"));
        }
        //业务逻辑处理
        Result result = Result.failure("000","111");
        return JSONUtil.toJson(result);
    }

    /**
     * 披露机构基本信息传输接口
     * @param requestData
     * @return
     */
    @RequestMapping("/sendcompanyinfo")
    @ApiOperation(value = "披露机构基本信息传输接口")
    public String sendCompanyInfo(@RequestParam("requestData")  String requestData){
        SendCompanyRequestVo sendCompanyRequestVo = SendCompanyRequestVo.builder().build();
        try {
            String entrance = new String(Base64Utils.decodeFromString(requestData),"utf-8");
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
        boolean flag = agencyDataEntryService.verifyUserInfo(sendCompanyRequestVo.getUsername(),String.valueOf(sendCompanyRequestVo.getTkey()), sendCompanyRequestVo.getX_Auth_Token());
        if(!flag){
            return JSONUtil.toJson(Result.failure(ResponseCode.ERROR_1002,"身份验证失败"));
        }
        //业务逻辑处理
        Result result = Result.failure("000","111");
        return JSONUtil.toJson(result);
    }

    /**
     * 机构目录库传输接口
     * @param requestData
     * @return
     */
    @PostMapping("/sendagencyinfo")
    @ApiOperation(value = "机构目录库传输接口")
    @ResponseBody
    public String  sendAgencyInfo( @RequestParam("requestData")  String requestData) {
        SendAgencyRequestVo sendAgencyRequestVo = SendAgencyRequestVo.builder().build();
        try {
            String entrance = new String(Base64Utils.decodeFromString(requestData),"utf-8");
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
        boolean flag = agencyDataEntryService.verifyUserInfo(sendAgencyRequestVo.getUsername(),String.valueOf(sendAgencyRequestVo.getTkey()), sendAgencyRequestVo.getX_Auth_Token());
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
        String username ="000001admin";
        String password = "5CE91DBFCE70F71839923C2067BF3022";
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
