package com.angenin.templatemethod.improve;

/**
 * @package_name: com.angenin.templatemethod
 * @name: RedBeanSoyaMilk
 * @author: angenin
 * @dateTime: 2020/7/13 6:59 下午
 **/
public class RedBeanSoyaMilk extends SoyaMilk {
    @Override
    public void addCondiments() {
        System.out.println("加入红豆做为配料");
    }
}
