package com.example.proxymode.order.staticproxy;

import com.example.proxymode.order.IOrderService;
import com.example.proxymode.order.Order;
import com.example.proxymode.order.OrderServiceImpl;
import com.example.proxymode.order.db.DataSourceContextHolder;

/**
 * Created at 2018/12/18 上午9:22.
 *
 * @author yixu.wang
 */
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        before();
        iOrderService = new OrderServiceImpl();
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理 分配到 【db" + dbRouter + "】处理数据");
        // 设置 dataSource
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
        after();
        return iOrderService.saveOrder(order);
    }

    private void before() {
        System.out.println("静态代理 Before Code");
    }

    private void after() {
        System.out.println("静态代理 After Code");
    }
}
