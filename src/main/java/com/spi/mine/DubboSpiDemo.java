package com.spi.mine;

import java.util.HashMap;
import java.util.Map;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dick <18668485565@163.com>
 * @version V1.0.0
 * @description dubbo Spi Demo
 * @date created on 2021/5/7
 */
@SpringBootApplication
public class DubboSpiDemo {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpiDemo.class, args);

        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
        Car car = extensionLoader.getExtension("benz");

        Map<String, String> map = new HashMap<>();
        map.put("wheel", "benz");
        URL url = new URL("", "", 1, map);
        car.getBrandByUrl(url);
    }

}
