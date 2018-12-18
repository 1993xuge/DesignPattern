package com.example.abstractfactory.car.product.tire;

/**
 * Created at 2018/1/11 上午9:56.
 *
 * @author yixu.wang
 */

public class NormalTile implements ITire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
