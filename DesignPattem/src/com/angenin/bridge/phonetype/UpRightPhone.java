package com.angenin.bridge.phonetype;

import com.angenin.bridge.Brand;

/**
 * @package_name: com.angenin.bridge
 * @name: UpRightPhone
 * @author: angenin
 * @dateTime: 2020/7/12 11:33 上午
 **/
public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    //子类实现接口
    @Override
    public void open(){
        System.out.println("直立式手机");
        super.open();
    }
    @Override
    public void close(){
        System.out.println("直立式手机");
        super.close();
    }
    @Override
    public void call(){
        System.out.println("直立式手机");
        super.call();
    }
}
