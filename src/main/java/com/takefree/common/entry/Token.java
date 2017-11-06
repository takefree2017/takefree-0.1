package com.takefree.common.entry;

import java.util.Date;

/**
 * Created by gaoxiang on 2017/11/4.
 */
public class Token {
    private String key;
    private Long userId;
    private Date loginTime;

    public Token(){

    }

    public Token(String key, Long userId, Date loginTime) {
        this.key = key;
        this.userId = userId;
        this.loginTime = loginTime;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }


}
