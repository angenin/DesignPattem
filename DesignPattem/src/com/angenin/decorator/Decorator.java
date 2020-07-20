package com.angenin.decorator;

/**
 * @package_name: com.angenin.decorator
 * @name: Decorator
 * @author: angenin
 * @dateTime: 2020/7/12 5:59 下午
 **/

//装饰者类
public class Decorator extends Drink {

    private Drink coffee;   //咖啡

    public Decorator(Drink coffee){
        this.coffee = coffee;   //聚合
    }

    @Override
    public float cost() {
        //配料价格+咖啡价格
        return super.getPrice() + coffee.cost();
    }

    @Override
    public String getDes() {
        //配料和咖啡的信息
        return super.getDes() + "&&" + coffee.getDes();
    }
}
