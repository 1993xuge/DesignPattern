package com.example.abstractfactory.car.product.tire;

/**
 * Created at 2018/1/11 上午9:57.
 *
 * @author yixu.wang
 */

public class SUVTire implements ITire {
    @Override
    public void tire() {
        System.out.println("越野轮胎");
    }
}
