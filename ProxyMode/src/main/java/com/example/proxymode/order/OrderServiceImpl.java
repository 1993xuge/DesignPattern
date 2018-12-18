package com.example.proxymode.order;

/**
 * Created at 2018/12/18 上午9:16.
 *
 * @author yixu.wang
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层 调用 Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
