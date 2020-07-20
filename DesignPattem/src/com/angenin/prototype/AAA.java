package com.angenin.prototype;

import java.io.Serializable;

/**
 * @package_name: com.angenin.prototype
 * @name: AAA
 * @author: angenin
 * @dateTime: 2020/7/11 7:33 下午
 **/

//只用于测试引用类型的深拷贝
public class AAA implements Cloneable, Serializable {

    private int id;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        AAA aaa = (AAA) super.clone();
        return aaa;
    }

    public AAA() {
    }

    public AAA(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AAA{" +
                "id=" + id +
                '}';
    }
}
