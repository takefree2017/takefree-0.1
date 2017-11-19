package com.takefree.common.entry;

import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.dto.model.UserDTO;
import lombok.Data;

import java.util.Date;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Data
public class Token {
    @JsonView(ResultView.DetailView.class)
    private String token;

    @JsonView(ResultView.DetailView.class)
    private UserDTO userDTO;

    @JsonView(ResultView.DetailView.class)
    private Date loginTime;

    public Token(){

    }

    public Token(String token, UserDTO userDTO, Date loginTime) {
        this.token = token;
        this.userDTO = userDTO;
        this.loginTime = loginTime;
    }


}
