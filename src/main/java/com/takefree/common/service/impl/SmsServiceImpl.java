package com.takefree.common.service.impl;

import com.takefree.common.entry.JsonObjectBase;
import com.takefree.common.entry.Sms;
import com.takefree.common.service.SmsService;
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
@ConfigurationProperties(prefix = "takefree")
@Data
public class SmsServiceImpl implements SmsService, InitializingBean {
    private static final Logger logger = LoggerFactory.getLogger(SmsServiceImpl.class);

    @NotNull
    private String smsBaseUrl;

    private SmsClientService smsClientService;

    public void afterPropertiesSet() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(smsBaseUrl)
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
}

interface SmsClientService {
    @Headers({"Content-Type: application/json;charset=UTF-8", "Accept: application/json"})
    @POST("/basicservice/notify/sms/v1/messages")
    public Call<JsonObjectBase> send(@Body Sms sms);
}

