package com.takefree.common.entry;

import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.model.UserInfoDO;

import java.util.Date;

/**
 * Created by gaoxiang on 2017/11/4.
 */
public class Token {
    @JsonView(ResultView.DetailView.class)
    private String key;

    @JsonView(ResultView.DetailView.class)
    private UserInfoDO userInfoDO;

    @JsonView(ResultView.DetailView.class)
    private Date loginTime;

    public Token(){

    }

    public Token(String key, UserInfoDO userInfoDO, Date loginTime) {
        this.key = key;
        this.userInfoDO = userInfoDO;
        this.loginTime = loginTime;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public UserInfoDO getUserInfoDO() {
        return userInfoDO;
    }

    public void setUserInfoDO(UserInfoDO userInfoDO) {
        this.userInfoDO = userInfoDO;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }


}
