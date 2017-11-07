package com.takefree.common.service;

import com.takefree.common.entry.Token;
import com.takefree.model.UserInfoDO;

/**
 * Created by gaoxiang on 2017/11/4.
 */
public interface TokenManager {
    public Token createToken (UserInfoDO userId);
    public boolean checkToken (Token token);
    public boolean refreshToken (Token token);
    public Token getToken (String key);
    public boolean deleteToken (String key);
}
