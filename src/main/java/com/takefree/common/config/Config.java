package com.takefree.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * Created by gaoxiang on 2017/12/11.
 */
@ConfigurationProperties("takefree")
@Data
@Component
@Validated
public class Config {
    @NotNull
    private String pictureBaseSpace;
}
