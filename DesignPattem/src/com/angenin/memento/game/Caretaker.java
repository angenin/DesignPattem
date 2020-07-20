package com.angenin.memento.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @package_name: com.angenin.memento.game
 * @name: Caretaker
 * @author: angenin
 * @dateTime: 2020/7/17 10:51 下午
 **/

//守护者类（保存游戏角色的状态）
public class Caretaker {

    //对一个游戏角色的一次保存
    private Memento memento;
    //对一个游戏角色的多次保存
    //private ArrayList<Memento> mementoList;
    //对多个游戏角色的多次保存
    //private HashMap<String, ArrayList<Memento>> rolesMemento;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
