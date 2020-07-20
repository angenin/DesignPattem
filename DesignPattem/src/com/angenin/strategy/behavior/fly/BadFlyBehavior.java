package com.angenin.strategy.behavior.fly;

/**
 * @package_name: com.angenin.strategy.behavior.fly
 * @name: BadFlyBehavior
 * @author: angenin
 * @dateTime: 2020/7/19 10:35 上午
 **/
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞行能力一般...");
    }
}
