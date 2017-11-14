package com.takefree.common.entry;

import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.model.UserDTO;

import java.util.Date;

/**
 * Created by gaoxiang on 2017/11/4.
 */
public class Token {
    @JsonView(ResultView.DetailView.class)
    private String key;

    @JsonView(ResultView.DetailView.class)
    private UserDTO userDTO;

    @JsonView(ResultView.DetailView.class)
    private Date loginTime;

    public Token(){

    }

    public Token(String key, UserDTO userDTO, Date loginTime) {
        this.key = key;
        this.userDTO = userDTO;
        this.loginTime = loginTime;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }


}
