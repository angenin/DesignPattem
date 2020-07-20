package com.angenin.iterator.college;

import java.util.Iterator;

/**
 * @package_name: com.angenin.iterator
 * @name: College
 * @author: angenin
 * @dateTime: 2020/7/16 6:26 下午
 **/
public interface College {

    public String getName();

    //增加系的方法
    public void addDepartment(String name, String desc);

    //返回一个迭代器，遍历
    public Iterator createIterator();

}
