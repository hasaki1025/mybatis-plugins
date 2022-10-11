package com.mybatis.plugins.ObjectFactory;

import com.mybatis.plugins.Annotations.PasswordField;
import com.mybatis.plugins.Proxy.PasswordPojoProxy;
import com.mybatis.plugins.Util.DefaultPasswordEncodeUtil;
import com.mybatis.plugins.Util.PasswordEncodeUtil;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.function.Predicate;

public class PaswordOjectFactory extends DefaultObjectFactory {
    Properties properties;


    @Override
    public void setProperties(Properties properties) {
        this.properties=properties;
    }

    @Override
    public <T> T create(Class<T> type) {
        T obj = super.create(type);
        Annotation[] annotations = type.getDeclaredAnnotations();
        if (type.isAnnotationPresent(PasswordField.class)) {
            PasswordPojoProxy<T> proxy = new PasswordPojoProxy<>(obj);
            try {
                proxy.setEncode(properties.containsKey("passwordEncode") ?
                        (PasswordEncodeUtil) Class.forName(properties.getProperty("passwordEncodeUtil")).getDeclaredConstructor().newInstance()
                        : new DefaultPasswordEncodeUtil());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
           obj= proxy.getProxy();
        }
        return obj;
    }


}
