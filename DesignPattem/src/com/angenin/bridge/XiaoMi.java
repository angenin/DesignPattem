package com.angenin.bridge;

/**
 * @package_name: com.angenin.bridge
 * @name: XiaoMi
 * @author: angenin
 * @dateTime: 2020/7/12 11:11 上午
 **/

//小米品牌手机
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
