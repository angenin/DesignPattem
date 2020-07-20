package com.angenin.iterator.iterator;

import com.angenin.iterator.Department;

import java.util.Iterator;

/**
 * @package_name: com.angenin.iterator
 * @name: ComputerCollegeIterator
 * @author: angenin
 * @dateTime: 2020/7/15 12:04 下午
 **/

//计算机学院迭代器
public class ComputerCollegeIterator implements Iterator {

    //这里我们需要 Department 是以怎样的方式存放
    Department[] departments;   //计算机学院使用数组
    int position = 0;   //遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断是否有下一个元素
    @Override
    public boolean hasNext() {
        if(position >= departments.length || departments[position] == null){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }
}
