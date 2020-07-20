package com.angenin.facade.hometheater;

/**
 * @package_name: com.angenin.facade
 * @name: TheaterLight
 * @author: angenin
 * @dateTime: 2020/7/17 9:46 下午
 **/

//影院灯光类
public class TheaterLight {


    private static final TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight on...");
    }
    public void off(){
        System.out.println("TheaterLight off...");
    }
    public void dim(){
        System.out.println("TheaterLight is dim...");
    }
    public void bright(){
        System.out.println("TheaterLight bright...");
    }

}
