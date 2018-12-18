package com.example.factory.car.product;

/**
 * Created at 2018/1/10 上午9:46.
 *
 * @author yixu.wang
 */

public class AudiQ5 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q5 启动了！");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q5 开始自动巡航了！");
    }
}
