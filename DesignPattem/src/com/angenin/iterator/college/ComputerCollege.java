package com.angenin.iterator.college;

import com.angenin.iterator.iterator.ComputerCollegeIterator;
import com.angenin.iterator.Department;

import java.util.Iterator;

/**
 * @package_name: com.angenin.iterator
 * @name: ComputerCollege
 * @author: angenin
 * @dateTime: 2020/7/16 6:29 下午
 **/

//计算机学院
public class ComputerCollege implements College {


    Department[] departments;   //数组形式
    int numOfDepartment = 0;    //保存当前数组的对象个数

    public ComputerCollege(){
        departments = new Department[5];
        addDepartment("Java", "java");
        addDepartment("PHP", "php");
        addDepartment("大数据", "大数据");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment++] = department;
    }

    @Override
    public Iterator createIterator() {
        //这里可以直接返回匿名内部类，就不需要建ComputerCollegeIterator类了
        return new ComputerCollegeIterator(departments);
    }
}
