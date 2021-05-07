package com.spi.mine;

import org.apache.dubbo.common.URL;

/**
 * @author dick <18668485565@163.com>
 * @version V1.0.0
 * @description
 * @date created on 2021/5/7
 */
public class BenzCar implements Car {

    private Wheel wheel;

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public void getBrandByUrl(URL url) {
        System.out.println("benzCar");
        wheel.getBrandByUrl(url);
    }
}
