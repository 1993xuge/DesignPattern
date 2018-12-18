package com.example.abstractfactory.introduce.factory;

import com.example.abstractfactory.introduce.product.AbstractProductA;
import com.example.abstractfactory.introduce.product.AbstractProductB;
import com.example.abstractfactory.introduce.product.ConcreteProductA1;
import com.example.abstractfactory.introduce.product.ConcreteProductB1;

/**
 * Created at 2018/1/11 上午9:36.
 *
 * @author yixu.wang
 */

public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
