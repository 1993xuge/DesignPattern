package com.example.proxymode.staticproxy.subject;

/**
 * Created at 2018/1/30 下午5:16.
 *
 * @author yixu.wang
 */

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real subject request !");
    }
}
