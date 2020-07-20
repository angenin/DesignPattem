package com.angenin.strategy.duck;

import com.angenin.strategy.behavior.fly.FlyBehavior;

/**
 * @package_name: com.angenin.strategy.duck
 * @name: Duck
 * @author: angenin
 * @dateTime: 2020/7/19 10:15 上午
 **/
public abstract class Duck {

    //策略接口，由子类创建
    FlyBehavior flyBehavior;

    //显示鸭子信息
    public abstract void display();

    public void quack(){
        System.out.println("鸭子嘎嘎叫...");
    }

    public void swim(){
        System.out.println("鸭子会游泳...");
    }

    public void fly(){
        //System.out.println("鸭子会飞...");

        //改进
        if(flyBehavior != null){
            flyBehavior.fly();
        }
    }
}
