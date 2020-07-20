package com.angenin.decorator;

import com.angenin.decorator.coffee.Espresso;
import com.angenin.decorator.ingredients.Chocolate;
import com.angenin.decorator.ingredients.Milk;

/**
 * @package_name: com.angenin.decorator
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/12 6:15 下午
 **/
public class Test {

    //测试装饰者模式
    public static void main(String[] args) {
        //下订单：2份巧克力+1份牛奶的Espresso咖啡

        //1. 制作Espresso咖啡
        Drink order = new Espresso();
        System.out.println("描述：" + order.getDes());
        System.out.println("价格1：" + order.cost());
        System.out.println(" v v v");

        //2. 加1份牛奶
        order = new Milk(order);
        System.out.println("描述：" + order.getDes());
        System.out.println("价格2：" + order.cost());
        System.out.println(" v v v");

        //3. 加1份巧克力
        order = new Chocolate(order);
        System.out.println("描述：" + order.getDes());
        System.out.println("价格3：" + order.cost());
        System.out.println(" v v v");

        //4. 加1份巧克力
        order = new Chocolate(order);
        System.out.println("描述：" + order.getDes());
        System.out.println("价格4：" + order.cost());
    }
}
