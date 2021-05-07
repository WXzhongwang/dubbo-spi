package com.spi.mine;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author dick <18668485565@163.com>
 * @version V1.0.0
 * @description car interface
 * @date created on 2021/5/7
 */
@SPI
public interface Car {

    void getBrandByUrl(URL url);
}
