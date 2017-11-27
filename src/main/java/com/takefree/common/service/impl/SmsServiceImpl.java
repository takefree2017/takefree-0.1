package com.takefree.common.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qianbao.redis.service.RedisClient;
import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.entry.JsonObjectBase;
import com.takefree.common.entry.Sms;
import com.takefree.common.service.SmsService;
import com.takefree.common.util.Util;
import com.takefree.common.web.constant.HttpStatus;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.http.*;

import javax.validation.constraints.NotNull;

/**
 * Created by gaoxiang on 2017/7/10.
 */
@Service
@ConfigurationProperties(prefix = "takefree.sms")
@Data
public class SmsServiceImpl implements SmsService, InitializingBean {
    private static final Logger logger = LoggerFactory.getLogger(SmsServiceImpl.class);

    @NotNull
    private String baseUrl;

    private SmsClientService smsClientService;

    @Reference(version = "1.0.0")
    private RedisClient redisClient;

    @NotNull
    private String redisNamespace;

    @NotNull
    private Integer redisTtl;

    @NotNull
    private Integer inteval;

    public void afterPropertiesSet() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        smsClientService = retrofit.create(SmsClientService.class);
    }

    public boolean send(String mobilePhone, String content) throws Exception {
        JsonObjectBase result = smsClientService.send(new Sms(mobilePhone, content)).execute().body();
        if (!result.getStatus().startsWith("200")) {
            logger.error("send sms error!{}", result);
            return false;
        } else {
            return true;
        }
    }

    //短信验证码
    public boolean sendCode(String mobile,String redisPreKey ,String smsTemplete) throws Exception {
        String redisKey=redisPreKey+mobile;

        //ttl经过时间小于短信最小间隔时间
        if(redisClient.ttl(redisNamespace,redisKey )+inteval>redisTtl){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "短信发送太频繁");
        }

        String code= Util.generateSmsCode();
        String content=smsTemplete.replace("$code$",code);
        JsonObjectBase result = smsClientService.send(new Sms(mobile, content)).execute().body();
        if (!result.getStatus().startsWith("200")) {
            logger.error("send sms error!{}", result);
            return false;
        } else {
            redisClient.setex(redisNamespace, redisKey, redisTtl, code);
            return true;
        }
    }

    //短信验证码
    public boolean checkCode(String mobile,String redisPreKey ,String code) throws Exception {
        String redisKey=redisPreKey+mobile;
        String redisCode=redisClient.get(redisNamespace, redisKey);
        if(redisCode!=null&&redisCode.equals(code)){
            return true;
        }else{
            return false;
        }
    }
}

interface SmsClientService {
    @Headers({"Content-Type: application/json;charset=UTF-8", "Accept: application/json"})
    @POST("/basicservice/notify/sms/v1/messages")
    public Call<JsonObjectBase> send(@Body Sms sms);
}

