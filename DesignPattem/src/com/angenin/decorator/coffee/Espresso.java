package com.angenin.decorator.coffee;

import com.angenin.decorator.Coffee;

/**
 * @package_name: com.angenin.decorator.coffee
 * @name: Espresso
 * @author: angenin
 * @dateTime: 2020/7/12 5:52 下午
 **/

//意大利咖啡
public class Espresso extends Coffee {

    public Espresso(){
        setDes("意大利咖啡");
        setPrice(6.0f);
    }

}
