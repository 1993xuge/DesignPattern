package com.example.abstractfactory.car.product.brake;

/**
 * Created at 2018/1/11 上午10:05.
 *
 * @author yixu.wang
 */

public class SeniorBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
