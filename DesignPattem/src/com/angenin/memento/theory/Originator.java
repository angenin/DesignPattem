package com.angenin.memento.theory;

/**
 * @package_name: com.angenin.memento.theory
 * @name: Memento
 * @author: angenin
 * @dateTime: 2020/7/17 10:16 下午
 **/

//原生类
public class Originator {

    private String state;   //状态信息

    //返回一个备忘录对象
    public Memento saveStateMemento(){
        return new Memento(state);
    }

    //通过备忘录对象，恢复状态
    public void  getStateFromMemento(Memento memento){
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
