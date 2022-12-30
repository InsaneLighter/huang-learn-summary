package com.huang;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Time 2022-12-06 18:19
 * Created by Huang
 * className: OperLogRequest
 * Description:
 */
@Data
@Slf4j
public class OperLogRequest {
    @Test
    public void currentWeek(){
        OperLogRequest operLogRequest = new OperLogRequest();
        log.info("operLogRequest: {}", JSONObject.toJSON(operLogRequest));
    }
    private String appId = "app-32144315432434";
    private String appVersion = "1.0.0";
    private String tenantCode = "1001";
    private String uid = "0";
    private String spmValue = "1";
    private String action = "1";
    private String spmTime = "2022-12-07 09:15:30";
    private String resourceSpm = "小程序";
    private String mobile = "Huawei Mate 30 Pro";
    private String browser = "Chrome";
    private String browserCore = "Chrome";
    private String channel = "渠道1";
    private String channel2 = "渠道2";
    private String guideVersion = "applets 1.0.0";
    private String portraitCode = "bsm1001";
    private String other = "其他信息";
    private String deviceBrand = "Huawei";
    private String deviceModel = "Huawei Mate 30 Pro";
    private String network = "5G";
    private String os = "HarmonyOS";
    private String osVersion = "HarmonyOS 1";
    private String uri = "/mobile/homePage";
    private String events = "{\"click_btn\":{\"ext0\":\"page\"},\"load_page\":\"event\"}";
}
