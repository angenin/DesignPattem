package com.angenin.decorator;

import com.angenin.decorator.Drink;

/**
 * @package_name: com.angenin.decorator.coffee
 * @name: Coffee
 * @author: angenin
 * @dateTime: 2020/7/12 5:51 下午
 **/

//被装饰类
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
