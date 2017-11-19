package com.takefree.common.service.impl;

import com.alibaba.boot.dubbo.annotation.DubboConsumer;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.takefree.common.entry.Token;
import com.takefree.common.service.TokenManager;
import com.takefree.dto.model.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

import com.qianbao.redis.service.RedisClient;
import org.springframework.validation.annotation.Validated;

@Service
@ConfigurationProperties("token.redis")
@Validated
public class RedisTokenManager implements TokenManager {
    Logger logger = LoggerFactory.getLogger(RedisTokenManager.class);

    @DubboConsumer(timeout = 10000)
    private RedisClient redisClient;

    @NotNull
    private String namespace;

    @NotNull
    private Integer ttl;

    public RedisClient getRedisClient() {
        return redisClient;
    }

    public void setRedisClient(RedisClient redisClient) {
        this.redisClient = redisClient;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    private boolean saveToken(Token token){
        //token缓存中不保存登录密码
        token.getUserDTO().setPassword(null);
        // 存储到 redis 并设置过期时间
        try {
            redisClient.setex(namespace, token.getToken(), ttl, JSON.toJSONString(token));
            return true;
        } catch (Exception e) {
            logger.error("", e);
            return false;
        }
    }

    public Token createToken(UserDTO userDTO) {
        // 使用 uuid 作为源 token
        String tokenId = UUID.randomUUID().toString().replace("-", "");
        Token token = new Token(tokenId, userDTO, new Date());

        if(saveToken(token)){
            return token;
        }else{
            return null;
        }
    }

    public boolean updateToken(Token token) {
        return saveToken(token);
    }

    public Token getToken(String key) {
        try {
            String tokenString = redisClient.get(namespace, key);
            if (tokenString != null) {
                return JSON.parseObject(tokenString,new TypeReference<Token>(){});
            }
        } catch (Exception e) {
            logger.error("", e);
            return null;
        }
        return null;
    }

    public boolean refreshToken(Token token) {
        if (token == null) {
            return false;
        }

        try {
            // 如果验证成功，说明此用户进行了一次有效操作，延长 token 的过期时间
            redisClient.expire(namespace, token.getToken(), ttl);
            return true;
        } catch (Exception e) {
            logger.error("", e);
            return false;
        }
    }

    public boolean checkToken(Token token) {
        if (token == null) {
            return false;
        }

        try {
            Token redisToken=this.getToken(token.getToken());
            if (redisToken==null||!token.getUserDTO().getId().equals(redisToken.getUserDTO().getId())) {
                return false;
            }
            // 如果验证成功，说明此用户进行了一次有效操作，延长 token 的过期时间
            redisClient.expire(namespace, token.getToken(), ttl);
            return true;
        } catch (Exception e) {
            logger.error("", e);
            return false;
        }
    }

    public boolean deleteToken(Token token) {
        try {
            redisClient.del(namespace,token.getToken());
            return true;
        } catch (Exception e) {
            logger.error("", e);
            return false;
        }
    }
}

