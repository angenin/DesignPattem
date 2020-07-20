package com.angenin.templatemethod.improve;

/**
 * @package_name: com.angenin.templatemethod
 * @name: PeanutSoyaMilk
 * @author: angenin
 * @dateTime: 2020/7/13 7:01 下午
 **/
public class PeanutSoyaMilk extends SoyaMilk {
    @Override
    public void addCondiments() {
        System.out.println("加入花生做为配料");
    }
}
