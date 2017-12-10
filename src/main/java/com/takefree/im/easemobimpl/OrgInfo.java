package com.takefree.im.easemobimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.annotation.PostConstruct;

/**
 * Created by easemob on 2017/3/31.
 */
@Component
public class OrgInfo {

    public static String org_name;
    @Value("${huanxin.org_name}")
    public String s_org;
    
    public static String app_name;
    @Value("${huanxin.app_name}")
    public String s_app;
    
    public static final Logger logger = LoggerFactory.getLogger(OrgInfo.class);

    @PostConstruct
    public void init(){
        this.org_name = this.s_org;
        this.app_name = this.s_app;
    }
    
//    static {
//        InputStream inputStream = OrgInfo.class.getClassLoader().getResourceAsStream("application.properties");
//        Properties prop = new Properties();
//        try {
//            prop.load(inputStream);
//        } catch (IOException e) {
//            logger.error(e.getMessage());
//        }
//        org_name = prop.getProperty("huanxin.org_name");
//        app_name = prop.getProperty("huanxin.app_name");
//    }
}
