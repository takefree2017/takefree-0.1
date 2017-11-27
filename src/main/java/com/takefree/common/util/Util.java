package com.takefree.common.util;

import com.xiaoleilu.hutool.crypto.SecureUtil;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by gaoxiang on 2017/7/19.
 */
public class Util {
    public static boolean isChinaPhoneLegal(String str) throws PatternSyntaxException {
        String regExp = "^((13[0-9])|(15[0-9])|(18[0-9])|(17[0-8])|(14[0-9]))\\d{8}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static String encryptPassword(String password){
        return SecureUtil.md5(SecureUtil.md5(password));
    }

    public static String generateSmsCode(){
        Random random = new Random(System.currentTimeMillis());
        int code = random.nextInt(899999) + 100000;
        return String.valueOf(code);
    }
}
