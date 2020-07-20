package com.angenin.iterator.college;

import com.angenin.iterator.Department;
import com.angenin.iterator.iterator.InfoCollegeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @package_name: com.angenin.iterator
 * @name: InfoCollege
 * @author: angenin
 * @dateTime: 2020/7/16 6:37 下午
 **/

//信息工程学院
public class InfoCollege implements College {

    List<Department> departments;


    public InfoCollege(){
        departments = new ArrayList<>();
        addDepartment("信息安全", "信息安全");
        addDepartment("网络安全", "网络安全");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments.add(department);
    }

    @Override
    public Iterator createIterator() {
        //这里可以直接返回匿名内部类，就不需要建InfoCollegeIterator类了
        return new InfoCollegeIterator(departments);
    }
}
