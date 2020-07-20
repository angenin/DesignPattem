package com.angenin.iterator;

/**
 * @package_name: com.angenin.iterator
 * @name: Department
 * @author: angenin
 * @dateTime: 2020/7/15 12:02 下午
 **/

//系
public class Department {

    private String name;
    private String desc;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
