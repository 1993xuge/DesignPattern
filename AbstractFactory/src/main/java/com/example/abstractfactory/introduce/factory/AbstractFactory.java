package com.example.abstractfactory.introduce.factory;

import com.example.abstractfactory.introduce.product.AbstractProductA;
import com.example.abstractfactory.introduce.product.AbstractProductB;

/**
 * Created at 2018/1/11 上午9:34.
 *
 * @author yixu.wang
 */

public abstract class AbstractFactory {

    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
