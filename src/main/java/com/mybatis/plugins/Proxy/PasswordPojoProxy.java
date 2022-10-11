package com.mybatis.plugins.Proxy;


import com.mybatis.plugins.Util.PasswordEncodeUtil;
import com.mybatis.plugins.Util.ProxyUtil;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class PasswordPojoProxy<T> implements MethodInterceptor {

    private T obj;

    private PasswordEncodeUtil encode;

    public void setEncode(PasswordEncodeUtil encode) {
        this.encode = encode;
    }

    public PasswordPojoProxy(T obj) {
        this.obj = obj;
    }

    public T getProxy() {
        // 1. 创建Enhancer类对象，它类似于咱们JDK动态代理中的Proxy类，该类就是用来获取代理对象的
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类的字节码对象。为啥子要这样做呢？因为使用CGLIB生成的代理类是属于目标类的子类的，也就是说代理类是要继承自目标类的
        enhancer.setSuperclass(obj.getClass());
        // 3. 设置回调函数
        enhancer.setCallback(this);
        // 4. 创建代理对象
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Class<?> targetClass = obj.getClass();
        if (!ProxyUtil.shouldSkip(obj.getClass(), method)) {
            if (method.getName().startsWith("set")) {
                String s = encode.passwordEncode((String) objects[0]);
                return  method.invoke(obj, s);
            }
            else if (method.getName().startsWith("get"))
            {
                return encode.passwordDecode((String) method.invoke(obj,objects));
            }
        }

        Object invoke = method.invoke(obj, objects);
        return invoke;
    }
}
