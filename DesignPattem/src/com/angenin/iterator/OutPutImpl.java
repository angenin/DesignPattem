package com.angenin.iterator;

import com.angenin.iterator.college.College;

import java.util.Iterator;
import java.util.List;

/**
 * @package_name: com.angenin.iterator
 * @name: OutPutImpl
 * @author: angenin
 * @dateTime: 2020/7/16 6:42 下午
 **/

//对外提供遍历学院和系的方法
public class OutPutImpl {

    //学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //遍历所有学院
    public void printCollege(){
        //取出所有学院，java中List已经实现Iterator
        Iterator<College> iterator = collegeList.iterator();

        //遍历学院
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("====" + college.getName() + "====");
            //遍历系
            printDepartment(college.createIterator());
        }
    }

    //学院输出系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}
