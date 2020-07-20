package com.angenin.visitor;

import com.angenin.visitor.action.Action;
import com.angenin.visitor.person.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @package_name: com.angenin.visitor
 * @name: ObjectStructure
 * @author: angenin
 * @dateTime: 2020/7/14 4:02 下午
 **/

//管理所有观众观众及测评结果
public class ObjectStructure {

    //维护一个集合
    private List<Person> persons = new LinkedList<>();

    //添加
    public void attach(Person person){
        persons.add(person);
    }
    //移除
    public void detach(Person person){
        persons.remove(person);
    }
    //显示测评情况（此方法为所有观众同一个测评结果）
    public void display(Action action){
        for (Person person : persons) {
            person.accept(action);
        }
    }
    //单个观众进行测评
    public void evaluation(int no, Action action){
        persons.get(no).accept(action);
    }

}
