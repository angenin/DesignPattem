package com.angenin.iterator;

import com.angenin.iterator.college.College;
import com.angenin.iterator.college.ComputerCollege;
import com.angenin.iterator.college.InfoCollege;

import java.util.ArrayList;
import java.util.List;

/**
 * @package_name: com.angenin.iterator
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/16 6:52 下午
 **/
public class Test {

    //测试迭代器模式
    public static void main(String[] args) {
        //创建学院
        List<College> collegeList = new ArrayList<>();

        //创建系
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        //添加￿系
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();
    }
}
