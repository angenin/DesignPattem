package com.angenin.iterator.iterator;

import com.angenin.iterator.Department;

import java.util.Iterator;
import java.util.List;

/**
 * @package_name: com.angenin.iterator
 * @name: InfoCollegeIterator
 * @author: angenin
 * @dateTime: 2020/7/15 12:13 下午
 **/

//信息工程学院迭代器
public class InfoCollegeIterator implements Iterator {

    List<Department> departments;   //信息工程学院使用list集合
    int index = -1;   //索引

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(index >= departments.size() - 1){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        index++;
        return departments.get(index);
    }
}
