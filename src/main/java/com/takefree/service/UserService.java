package com.takefree.service;

import com.takefree.common.entry.Token;
import com.takefree.dto.model.UserDTO;
import com.takefree.pojo.model.UserInfo;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface UserService {

    UserDTO getUserInfoById(Long id);

    UserDTO getUserDetailById(Long id);

    boolean create(UserDTO userDTO);

    void updateById(UserDTO userDTO);

    List<UserInfo> getUserInfoByMobile(String mobile);

    Token login(UserDTO userDTO) throws Exception;

    Boolean logout(Token token) throws Exception;
}
