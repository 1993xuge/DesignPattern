package com.example.abstractfactory.car.product.engine;

/**
 * Created at 2018/1/11 上午10:03.
 *
 * @author yixu.wang
 */

public class ImportEngine implements IEngine {
    @Override
    public void engine() {
        System.out.println("进口发动机");
    }
}
