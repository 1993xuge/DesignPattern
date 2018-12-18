package com.example.strategy.price.strategy;

/**
 * Created at 2018/1/11 下午7:21.
 *
 * @author yixu.wang
 */

public class BusStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        return 20;
    }
}
