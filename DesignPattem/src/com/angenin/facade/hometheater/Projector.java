package com.angenin.facade.hometheater;

/**
 * @package_name: com.angenin.facade
 * @name: DVDPlayer
 * @author: angenin
 * @dateTime: 2020/7/17 9:36 下午
 **/

//投影仪类
public class Projector {

    private static final Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Projector on...");
    }
    public void off(){
        System.out.println("Projector off...");
    }
    public void focus(){
        System.out.println("Projector is focus...");
    }
}
