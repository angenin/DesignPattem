package com.angenin.bridge;

/**
 * @package_name: com.angenin.bridge
 * @name: Vivo
 * @author: angenin
 * @dateTime: 2020/7/12 11:12 上午
 **/

//Vivo品牌手机
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关机");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话");
    }
}
