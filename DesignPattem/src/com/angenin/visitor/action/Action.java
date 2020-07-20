package com.angenin.visitor.action;

import com.angenin.visitor.person.Man;
import com.angenin.visitor.person.Woman;

/**
 * @package_name: com.angenin.visitor
 * @name: Action
 * @author: angenin
 * @dateTime: 2020/7/14 3:45 下午
 **/

//观众的测评结果类（抽象访问者类）
public abstract class Action {

    //得到男性观众的评测
    public abstract void getManResult(Man man);


    //得到女性观众的评测
    public abstract void getWomanResult(Woman woman);
}
