package com.angenin.decorator.ingredients;

import com.angenin.decorator.Decorator;
import com.angenin.decorator.Drink;

/**
 * @package_name: com.angenin.decorator.ingredients
 * @name: Milk
 * @author: angenin
 * @dateTime: 2020/7/12 6:12 下午
 **/

//牛奶配料
public class Milk extends Decorator {

    public Milk(Drink coffee) {
        super(coffee);
        setDes("牛奶配料");
        setPrice(2.0f);
    }

}
