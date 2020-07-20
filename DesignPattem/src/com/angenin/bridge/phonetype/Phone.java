package com.angenin.bridge.phonetype;

import com.angenin.bridge.Brand;

/**
 * @package_name: com.angenin.bridge
 * @name: Phone
 * @author: angenin
 * @dateTime: 2020/7/12 11:14 上午
 **/

//手机类型
public class Phone {

    //手机品牌
    //父类聚合接口
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }
    protected void close(){
        this.brand.close();
    }
    protected void call(){
        this.brand.call();
    }

}
