package com.angenin.decorator.coffee;

import com.angenin.decorator.Coffee;

/**
 * @package_name: com.angenin.decorator.coffee
 * @name: ShortBlack
 * @author: angenin
 * @dateTime: 2020/7/12 5:55 下午
 **/

//无因咖啡
public class Decaf extends Coffee {

    public Decaf(){
        setDes("无因咖啡");
        setPrice(4.0f);
    }

}
