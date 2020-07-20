package com.angenin.visitor.person;

import com.angenin.visitor.action.Action;

/**
 * @package_name: com.angenin.visitor.person
 * @name: Person
 * @author: angenin
 * @dateTime: 2020/7/14 3:47 下午
 **/

//观众类
public abstract class Person {

    //提供一个方法，让访问者可以访问
    public abstract void accept(Action action);

}
