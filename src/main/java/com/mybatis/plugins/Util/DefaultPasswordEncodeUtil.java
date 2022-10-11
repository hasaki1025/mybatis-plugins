package com.mybatis.plugins.Util;

public class DefaultPasswordEncodeUtil implements PasswordEncodeUtil {
    @Override
    public String passwordEncode(String password) {
        return "123";
    }

    @Override
    public String passwordDecode(String password) {
        return "321";
    }
}
