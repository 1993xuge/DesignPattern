package com.example.abstractfactory.car.factory;

import com.example.abstractfactory.car.product.brake.IBrake;
import com.example.abstractfactory.car.product.brake.SeniorBrake;
import com.example.abstractfactory.car.product.engine.IEngine;
import com.example.abstractfactory.car.product.engine.ImportEngine;
import com.example.abstractfactory.car.product.tire.ITire;
import com.example.abstractfactory.car.product.tire.SUVTire;

/**
 * Created at 2018/1/11 上午10:09.
 *
 * @author yixu.wang
 */

public class Q7Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }
}
