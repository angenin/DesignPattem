package com.angenin.strategy;

import com.angenin.strategy.behavior.fly.NotFlyBehavior;
import com.angenin.strategy.duck.PekingDuck;
import com.angenin.strategy.duck.ToyDuck;
import com.angenin.strategy.duck.WildDuck;

/**
 * @package_name: com.angenin.strategy
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/19 10:22 上午
 **/
public class Test {

    //测试策略模式
    public static void main(String[] args) {
        //创建野鸭对象
        WildDuck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();

        //创建玩具鸭对象
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();

        //创建北京鸭对象
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.fly();
        //动态更改北京鸭的飞行能力
        pekingDuck.setFlyBehavior(new NotFlyBehavior());
        System.out.println(" v v v ");
        pekingDuck.fly();
    }

}
