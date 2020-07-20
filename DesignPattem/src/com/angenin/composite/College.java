package com.angenin.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @package_name: com.angenin.composite
 * @name: College
 * @author: angenin
 * @dateTime: 2020/7/12 9:44 下午
 **/

//学院类
public class College extends OrganizationComponent {

    //list里的OrganizationComponent是Department，即专业
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String des) {
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

    //print方法：输出College包含的专业
    @Override
    protected void print() {
        System.out.println("---------" + getName() + "----------");
        // 遍历organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
