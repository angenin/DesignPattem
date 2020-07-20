package com.angenin.composite;

/**
 * @package_name: com.angenin.composite
 * @name: Department
 * @author: angenin
 * @dateTime: 2020/7/12 9:45 下午
 **/

//专业类（叶子节点）
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
