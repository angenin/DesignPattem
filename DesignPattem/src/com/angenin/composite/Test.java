package com.angenin.composite;

/**
 * @package_name: com.angenin.composite
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/12 9:52 下午
 **/
public class Test {

    //测试组合模式
    public static void main(String[] args) {
        //创建大学对象
        OrganizationComponent university = new University("清华大学", "清华大学");

        //创建学院对象
        OrganizationComponent college1 = new College("计算机学院", "计算机学院");
        OrganizationComponent college2 = new College("信息工程学院", "信息工程学院");
        //添加学院对象
        university.add(college1);
        university.add(college2);

        //添加专业对象
        college1.add(new Department("软件工程", "软件工程"));
        college1.add(new Department("网络工程", "网络工程"));
        college1.add(new Department("计算机科学与技术", "计算机科学与技术"));

        college2.add(new Department("通信工程", "通信工程"));
        college2.add(new Department("信息工程", "信息工程"));

        //打印整个大学
        //university.print();

        //打印计算机学院
        college1.print();
    }
}
