package com.angenin.decorator.ingredients;

import com.angenin.decorator.Decorator;
import com.angenin.decorator.Drink;

/**
 * @package_name: com.angenin.decorator.ingredients
 * @name: chocolate
 * @author: angenin
 * @dateTime: 2020/7/12 6:09 下午
 **/

//巧克力配料
public class Chocolate extends Decorator {

    public Chocolate(Drink coffee) {
        super(coffee);
        setDes("巧克力配料");
        setPrice(3.0f);
    }

}
