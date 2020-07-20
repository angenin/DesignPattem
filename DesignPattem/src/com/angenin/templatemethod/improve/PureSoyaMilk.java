package com.angenin.templatemethod.improve;

/**
 * @package_name: com.angenin.templatemethod.improve
 * @name: PureSoyaMilk
 * @author: angenin
 * @dateTime: 2020/7/13 7:20 下午
 **/
public class PureSoyaMilk extends SoyaMilk {
    @Override
    public void addCondiments() {
        //空实现
    }

    @Override
    public boolean customerWantCondiments() {
        //不加配料
        return false;
    }
}
