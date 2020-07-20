package com.angenin.memento.theory;

/**
 * @package_name: com.angenin.memento.theory
 * @name: Memento
 * @author: angenin
 * @dateTime: 2020/7/17 10:21 下午
 **/

//备忘录类
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
