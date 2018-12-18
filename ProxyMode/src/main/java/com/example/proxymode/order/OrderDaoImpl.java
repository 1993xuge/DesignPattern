package com.example.proxymode.order;

/**
 * Created at 2018/12/18 上午9:09.
 *
 * @author yixu.wang
 */
public class OrderDaoImpl implements IOrderDao{

    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
