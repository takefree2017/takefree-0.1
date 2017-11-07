package com.takefree.common.config;

import com.takefree.common.handle.AuthorizationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by gaoxiang on 2017/7/17.
 */
@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter {
    @Bean
    AuthorizationInterceptor createInterceptor() {
        return new AuthorizationInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链

        // addPathPatterns 用于添加拦截规则

        // excludePathPatterns 用户排除拦截

        registry.addInterceptor(createInterceptor()).addPathPatterns("/**");

        super.addInterceptors(registry);

    }

}
