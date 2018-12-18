package com.example.factory.car.product;

/**
 * Created at 2018/1/10 上午9:44.
 *
 * @author yixu.wang
 */

public class AudiQ3 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q3 启动了！");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q3 开始自动巡航了！");
    }
}
