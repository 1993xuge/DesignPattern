package com.example.proxymode;

import com.example.proxymode.dynamicproxy.IUserDao;
import com.example.proxymode.dynamicproxy.ProxyFactory;
import com.example.proxymode.dynamicproxy.UserDao;
import com.example.proxymode.staticproxy.subject.ProxySubject;

public class myClass {
    public static final void main(String[] args) {
//        testSubject();
        testDynamicProxy();
    }

    private static void testSubject() {
        ProxySubject proxySubject = new ProxySubject();
        proxySubject.request();
    }

    private static void testDynamicProxy() {
        IUserDao target = new UserDao();
        System.out.println(target.getClass());

        IUserDao proxy = (IUserDao) ProxyFactory.getProxyInstance(target);
        System.out.println(proxy.getClass());

        proxy.save();
        proxy.delete();
    }
}
