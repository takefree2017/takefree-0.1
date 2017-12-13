package com.takefree.im.easemobimpl;

import com.google.gson.Gson;
import io.swagger.client.ApiException;
import io.swagger.client.api.AuthenticationApi;
import io.swagger.client.model.Token;
import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;


//@ConfigurationProperties(ignoreUnknownFields = true, prefix = "huanxin")
//@ConfigurationProperties("huanxin")

public class TokenUtil {

    public static String grant_type;
    private static String client_id;
    private static String client_secret;
    private static Token BODY;
    private static AuthenticationApi API = new AuthenticationApi();
    private static String ACCESS_TOKEN;
    private static String ADMIN_TOKEN;
	private static String SMS_TOKEN;
    private static Double EXPIREDAT = -1D;
    private static final Logger logger = LoggerFactory.getLogger(TokenUtil.class);

    /**
     * get token from server
     */
    static {
        InputStream inputStream = TokenUtil.class.getClassLoader().getResourceAsStream("application.properties");
        Properties prop = new Properties();
        try {
            prop.load(inputStream);
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        grant_type = prop.getProperty("huanxin.grant_type");
        client_id = prop.getProperty("huanxin.client_id");
        client_secret = prop.getProperty("huanxin.client_secret");
        BODY = new Token().clientId(client_id).grantType(grant_type).clientSecret(client_secret);
    }

    public static void initTokenByProp() {
        String resp = null;
        try {
            resp = API.orgNameAppNameTokenPost(OrgInfo.org_name, OrgInfo.app_name, BODY);
        } catch (ApiException e) {
            logger.error(e.getMessage());
        }
        Gson gson = new Gson();
        Map map = gson.fromJson(resp, Map.class);
        ACCESS_TOKEN = " Bearer " + map.get("access_token");
        EXPIREDAT = System.currentTimeMillis() + (Double) map.get("expires_in");
    }

    /**
     * get Token from memory
     *
     * @return
     */
    public static String getAccessToken() {
        if (ACCESS_TOKEN == null || isExpired()) {
            initTokenByProp();
        }
        return ACCESS_TOKEN;
    }

    private static Boolean isExpired() {
        return System.currentTimeMillis() > EXPIREDAT;
    }

    public static String getADMIN_TOKEN() {
		return ADMIN_TOKEN;
	}

	public static void setADMIN_TOKEN(String aDMIN_TOKEN) {
		ADMIN_TOKEN = aDMIN_TOKEN;
	}

	public static String getSMS_TOKEN() {
		return SMS_TOKEN;
	}

	public static void setSMS_TOKEN(String sMS_TOKEN) {
		SMS_TOKEN = sMS_TOKEN;
	}

}

