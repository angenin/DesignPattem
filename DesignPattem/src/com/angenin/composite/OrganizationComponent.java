package com.angenin.composite;

/**
 * @package_name: com.angenin.composite
 * @name: OrganizationComponent
 * @author: angenin
 * @dateTime: 2020/7/12 9:24 下午
 **/

//可以看做学校
public abstract class OrganizationComponent {

    private String name;    //名字
    private String des;     //说明

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(OrganizationComponent organizationComponent){
        //默认实现
        //抛出不支持操作异常，不能直接使用，需要子类实现后才可用
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        //默认实现
        //抛出不支持操作异常，不能直接使用，需要子类实现后才可用
        throw new UnsupportedOperationException();
    }

    //方法print做成抽象方法，子类都需要实现
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
