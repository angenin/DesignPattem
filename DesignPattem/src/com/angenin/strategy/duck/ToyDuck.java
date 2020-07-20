package com.angenin.strategy.duck;

import com.angenin.strategy.behavior.fly.FlyBehavior;
import com.angenin.strategy.behavior.fly.NotFlyBehavior;

/**
 * @package_name: com.angenin.strategy.duck
 * @name: ToyDuck
 * @author: angenin
 * @dateTime: 2020/7/19 10:20 上午
 **/
public class ToyDuck extends Duck {

    public ToyDuck(){
        super.flyBehavior = new NotFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("---玩具鸭---");
    }

    //假设玩具鸭什么都做不了，所以需要重写父类的所有方法
    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫...");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不能游泳...");
    }

//    @Override
//    public void fly() {
//        System.out.println("玩具鸭不能飞...");
//    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        super.flyBehavior = flyBehavior;
    }
}
