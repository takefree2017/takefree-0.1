package com.takefree.common.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qianbao.redis.service.RedisClient;
import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.service.CaptchaService;
import com.takefree.common.service.SmsService;
import com.takefree.common.util.Util;
import com.takefree.common.web.constant.HttpStatus;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

/**
 * Created by gaoxiang on 2017/7/10.
 */
@Service
@ConfigurationProperties(prefix = "takefree.captcha.redis.prefix.login")
@Data
public class CaptchaServiceImpl implements CaptchaService {
    private static final Logger logger = LoggerFactory.getLogger(CaptchaServiceImpl.class);

    @NotNull
    private String baseUrl;

    @Autowired
    private SmsService smsService;

    @Reference(version = "1.0.0")
    private RedisClient redisClient;

    @NotNull
    private String redisNamespace;

    @NotNull
    private Integer redisTtl;

    @NotNull
    private Integer inteval;

    @NotNull
    private static String redisPrefixLogin;


    //短信验证码
    public boolean sendLoginCode(String mobile) throws Exception {
        String redisKey=redisPrefixLogin+mobile;

        //ttl经过时间小于短信最小间隔时间
        if(redisClient.ttl(redisNamespace,redisKey )+inteval>redisTtl){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "短信发送太频繁");
        }

        String code= Util.generateSmsCode();

        return smsService.sendCode(mobile, code);

    }

    //短信验证码
    public boolean checkLoginCode(String mobile,String code) throws Exception {
        String redisKey=redisPrefixLogin+mobile;
        String redisCode=redisClient.get(redisNamespace, redisKey);
        if(redisCode!=null&&redisCode.equals(code)){
            return true;
        }else{
            return false;
        }
    }
}

