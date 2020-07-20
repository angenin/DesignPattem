package com.angenin.strategy.behavior.fly;

/**
 * @package_name: com.angenin.strategy.behavior.fly
 * @name: NotFlyBehavior
 * @author: angenin
 * @dateTime: 2020/7/19 10:36 上午
 **/
public class NotFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞...");
    }
}
