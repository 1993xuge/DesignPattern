package com.example.factory.car.factory;

import com.example.factory.car.product.AudiCar;

/**
 * Created at 2018/1/9 下午8:00.
 *
 * @author yixu.wang
 */

public abstract class AudiFactory {
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}
