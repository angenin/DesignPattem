package com.angenin.decorator;

/**
 * @package_name: com.angenin.decorator
 * @name: Drink
 * @author: angenin
 * @dateTime: 2020/7/12 5:45 下午
 **/

//订单
public abstract class Drink {

    private String des;         //描述
    private float price = 0.0f; //价格

    //计算费用的抽象方法
    //子类来实现
    public abstract float cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
