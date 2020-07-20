package com.angenin.decorator.ingredients;

import com.angenin.decorator.Decorator;
import com.angenin.decorator.Drink;

/**
 * @package_name: com.angenin.decorator.ingredients
 * @name: SugarCube
 * @author: angenin
 * @dateTime: 2020/7/12 6:13 下午
 **/

//方糖配料
public class SugarCube extends Decorator {


    public SugarCube(Drink coffee) {
        super(coffee);
        setDes("方糖配料");
        setPrice(1.0f);
    }
}
