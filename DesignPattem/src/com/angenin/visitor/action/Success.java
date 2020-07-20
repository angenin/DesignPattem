package com.angenin.visitor.action;

import com.angenin.visitor.person.Man;
import com.angenin.visitor.person.Woman;

/**
 * @package_name: com.angenin.visitor.action
 * @name: Success
 * @author: angenin
 * @dateTime: 2020/7/14 3:50 下午
 **/

//成功测评类
public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println(man.getNo() + "号（男性）观众给出成功测评结果！");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(woman.getNo() + "号（女性）观众给出成功测评结果！");
    }
}
