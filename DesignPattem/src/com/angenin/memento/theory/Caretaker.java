package com.angenin.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @package_name: com.angenin.memento.theory
 * @name: Caretaker
 * @author: angenin
 * @dateTime: 2020/7/17 10:26 下午
 **/

//守护者类
public class Caretaker {

    private List<Memento> mementoList = new ArrayList<>();

    //保存备忘录对象
    public void add(Memento memento){
        mementoList.add(memento);
    }

    //根据索引获取备忘录对象
    public Memento get(int index){
        return mementoList.get(index);
    }
}
