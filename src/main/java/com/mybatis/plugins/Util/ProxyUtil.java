package com.mybatis.plugins.Util;

import com.mybatis.plugins.Annotations.PasswordField;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ProxyUtil {


    private static PasswordEncodeUtil passwordEncodeUtil;

    public static boolean shouldSkip(Class<?> clazz,Method method)
    {
        PasswordField field = clazz.getDeclaredAnnotation(PasswordField.class);
        String fieldName = field.value();
        String setMethodName=("set"+fieldName).toUpperCase();
        String getMethodName=("get"+fieldName).toUpperCase();
        String methodName=method.getName().toUpperCase();
        return !(methodName.equals(setMethodName) || methodName.equals(getMethodName));
    }
}