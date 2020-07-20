package com.angenin.visitor;

import com.angenin.visitor.action.Fail;
import com.angenin.visitor.action.Success;
import com.angenin.visitor.action.Wait;
import com.angenin.visitor.person.Man;
import com.angenin.visitor.person.Woman;

/**
 * @package_name: com.angenin.visitor
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/14 4:11 下午
 **/
public class Test {

    //参数访问者模式
    public static void main(String[] args) {
        //创建ObjectStructure观众集合类
        ObjectStructure objectStructure = new ObjectStructure();

        //增加观众
        objectStructure.attach(new Man(0));
        objectStructure.attach(new Man(1));
        objectStructure.attach(new Woman(2));

        //创建成功类
        Success success = new Success();
        //创建失败类
        Fail fail = new Fail();
        //创建待定类
        Wait wait = new Wait();

        //进行测评
        objectStructure.evaluation(0, success);
        objectStructure.evaluation(1, wait);
        objectStructure.evaluation(2, fail);
    }
}
