package com.example.factory.car.factory;

import com.example.factory.car.product.AudiCar;

/**
 * Created at 2018/1/10 上午9:38.
 *
 * @author yixu.wang
 */

public class AudiCarFactory extends AudiFactory {
    @Override
    public <T extends AudiCar> T createAudiCar(Class<T> clz) {
        AudiCar car = null;
        try {
            car = (AudiCar) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) car;
    }
}
