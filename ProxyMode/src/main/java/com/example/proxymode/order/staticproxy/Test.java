package com.example.proxymode.order.staticproxy;

import com.example.proxymode.order.Order;

/**
 * Created at 2018/12/18 上午9:39.
 *
 * @author yixu.wang
 */
public class Test {
    public static final void main(String[] args){

        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
