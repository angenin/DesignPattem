package com.angenin.strategy.behavior.fly;

/**
 * @package_name: com.angenin.strategy.behavior
 * @name: GoodFlyBehavior
 * @author: angenin
 * @dateTime: 2020/7/19 10:34 上午
 **/
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞行能力强...");
    }
}
