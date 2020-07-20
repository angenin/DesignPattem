package com.angenin.strategy.duck;

import com.angenin.strategy.behavior.fly.BadFlyBehavior;
import com.angenin.strategy.behavior.fly.FlyBehavior;
import com.angenin.strategy.behavior.fly.NotFlyBehavior;

/**
 * @package_name: com.angenin.strategy.duck
 * @name: PekingDuck
 * @author: angenin
 * @dateTime: 2020/7/19 10:19 上午
 **/
public class PekingDuck extends Duck {

    public PekingDuck(){
        super.flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("---北京鸭---");
    }

    //假设北京鸭飞行能力一般，需要重写fly
//    @Override
//    public void fly() {
//        System.out.println("北京鸭飞行能力一般...");
//    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        super.flyBehavior = flyBehavior;
    }
}
