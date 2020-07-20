package com.angenin.strategy.duck;

import com.angenin.strategy.behavior.fly.FlyBehavior;
import com.angenin.strategy.behavior.fly.GoodFlyBehavior;

/**
 * @package_name: com.angenin.strategy.duck
 * @name: WildDuck
 * @author: angenin
 * @dateTime: 2020/7/19 10:18 上午
 **/
public class WildDuck extends Duck {

    public WildDuck(){
        super.flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("---野鸭---");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        super.flyBehavior = flyBehavior;
    }
}
