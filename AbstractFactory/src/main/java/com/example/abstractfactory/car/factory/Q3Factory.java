package com.example.abstractfactory.car.factory;

import com.example.abstractfactory.car.product.brake.IBrake;
import com.example.abstractfactory.car.product.brake.NormalBrake;
import com.example.abstractfactory.car.product.engine.DomesticEngine;
import com.example.abstractfactory.car.product.engine.IEngine;
import com.example.abstractfactory.car.product.tire.ITire;
import com.example.abstractfactory.car.product.tire.NormalTile;

/**
 * Created at 2018/1/11 上午10:08.
 *
 * @author yixu.wang
 */

public class Q3Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new NormalTile();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}
