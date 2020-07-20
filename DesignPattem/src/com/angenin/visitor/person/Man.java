package com.angenin.visitor.person;

import com.angenin.visitor.action.Action;

/**
 * @package_name: com.angenin.visitor
 * @name: Man
 * @author: angenin
 * @dateTime: 2020/7/14 3:46 下午
 **/

//男性观众类
//1. 这里使用到了双分派：首先在客户端程序中，将具体状态作为参数传递Man中（第一次分派）
//2. 然后Man类调用作为参数的"具体方法"中的方法getManResult，同时将自己（this）作为参数传入，完成第二次的分派
public class Man extends Person {

    private int no; //观众编号

    public Man(int no) {
        this.no = no;
    }

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
