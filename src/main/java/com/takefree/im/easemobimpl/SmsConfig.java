package com.takefree.im.easemobimpl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

//@PropertySource(value = "classpath:application.properties",encoding = "utf-8")
@Data
@Component
@ConfigurationProperties(prefix = "huanxin.sms")
public class SmsConfig {

	private String orderId;

	private String sign;
}
