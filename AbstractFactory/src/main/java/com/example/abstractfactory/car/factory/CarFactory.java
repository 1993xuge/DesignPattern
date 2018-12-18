package com.example.abstractfactory.car.factory;

import com.example.abstractfactory.car.product.brake.IBrake;
import com.example.abstractfactory.car.product.engine.IEngine;
import com.example.abstractfactory.car.product.tire.ITire;

/**
 * Created at 2018/1/11 上午9:49.
 *
 * @author yixu.wang
 */

public abstract class CarFactory {

    public abstract ITire createTire();

    public abstract IEngine createEngine();

    public abstract IBrake createBrake();
}
