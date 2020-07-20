package com.angenin.facade.hometheater;

/**
 * @package_name: com.angenin.facade
 * @name: Popcorn
 * @author: angenin
 * @dateTime: 2020/7/17 9:39 下午
 **/

//爆米花机类
public class Popcorn {


    private static final Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Popcorn on...");
    }
    public void off(){
        System.out.println("Popcorn off...");
    }
    public void pop(){
        System.out.println("Popcorn is poping...");
    }

}
