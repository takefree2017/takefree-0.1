package com.takefree.common.service;

import com.takefree.common.entry.Token;

/**
 * Created by gaoxiang on 2017/11/4.
 */
public interface TokenManager {
    public Token createToken (Long userId);
    public boolean checkToken (Token token);
    public boolean refreshToken (Token token);
    public Token getToken (String key);
    public boolean deleteToken (String key);
}
