package com.example.proxymode.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created at 2018/12/10 下午7:08.
 *
 * @author yixu.wang
 */
public class ProxyFactory {
    public static Object getProxyInstance(final Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开启事务");
                        Object returnValue = method.invoke(target, args);
                        System.out.println("提交事务");
                        return returnValue;
                    }
                });
    }
}
