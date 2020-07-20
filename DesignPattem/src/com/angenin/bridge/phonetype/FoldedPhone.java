package com.angenin.bridge.phonetype;

import com.angenin.bridge.Brand;

/**
 * @package_name: com.angenin.bridge
 * @name: FoldedPhone
 * @author: angenin
 * @dateTime: 2020/7/12 11:18 上午
 **/

//折叠式手机
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    //子类实现接口
    @Override
    public void open(){
        System.out.println("折叠式手机");
        super.open();
    }
    @Override
    public void close(){
        System.out.println("折叠式手机");
        super.close();
    }
    @Override
    public void call(){
        System.out.println("折叠式手机");
        super.call();
    }

}
