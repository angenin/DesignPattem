package com.angenin.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @package_name: com.angenin.composite
 * @name: University
 * @author: angenin
 * @dateTime: 2020/7/12 9:32 下午
 **/

//大学类
//University就是Composite，可以管理College
public class University extends OrganizationComponent {

    //list里的OrganizationComponent是College，即学院
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    //重写add方法
    @Override
    protected void add(OrganizationComponent organizationComponent){
        organizationComponents.add(organizationComponent);
    }

    //重写remove方法
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    //print方法：输出University包含的学院
    @Override
    protected void print() {
        System.out.println("------" + getName() + "-------");
        // 遍历organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
