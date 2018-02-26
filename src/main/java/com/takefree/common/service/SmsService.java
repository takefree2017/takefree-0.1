package com.takefree.common.service;

import com.aliyuncs.exceptions.ClientException;

/**
 * Created by gaoxiang on 2017/7/7.
 */
public interface SmsService {
//    public boolean send(String mobilePhone, String content) throws Exception;

    public boolean sendCode(String mobile, String code) throws Exception;
    
    //查询短信最终发送成功与否，outid在sendSms中生成 规则 “手机号@时间戳” 例 ：18910789656@20180226 06:23:34.012
    public boolean querySendStatus(String outid) throws ClientException;
}
