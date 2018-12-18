package com.example.proxymode.staticproxy.subject;

/**
 * Created at 2018/1/30 下午5:17.
 *
 * @author yixu.wang
 */

public class ProxySubject implements Subject {
    private RealSubject realSubject = new RealSubject();

    @Override
    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("ProxySubject, preRequest !");
    }

    private void postRequest() {
        System.out.println("ProxySubject, postRequest !");
    }
}
