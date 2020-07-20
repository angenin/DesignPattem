package com.angenin.memento.theory;

/**
 * @package_name: com.angenin.memento.theory
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/17 10:30 下午
 **/
public class Test {

    //测试备忘录模式
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        //设置状态
        originator.setState("状态0：100");
        //保存状态
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态1：80");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态2：120");
        caretaker.add(originator.saveStateMemento());

        //当前状态
        System.out.println("当前状态："+  originator.getState());
        System.out.println("---------");

        //恢复到状态1
        originator.getStateFromMemento(caretaker.get(1));

        //当前状态
        System.out.println("当前状态："+  originator.getState());

    }
}
