package com.angenin.flyweight;

/**
 * @package_name: com.angenin.flyweight
 * @name: User
 * @author: angenin
 * @dateTime: 2020/7/13 11:03 上午
 **/

//用户类（外部状态）
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
