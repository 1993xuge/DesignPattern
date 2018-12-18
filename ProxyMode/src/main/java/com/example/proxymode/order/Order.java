package com.example.proxymode.order;

/**
 * Created at 2018/12/18 上午9:06.
 *
 * @author yixu.wang
 */
public class Order {

    private Object orderInfo;
    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
