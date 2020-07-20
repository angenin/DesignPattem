package com.angenin.facade.hometheater;

/**
 * @package_name: com.angenin.facade
 * @name: DVDPlayer
 * @author: angenin
 * @dateTime: 2020/7/17 9:36 下午
 **/

//屏幕类
public class Screen {

    private static final Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println("Screen up...");
    }
    public void down(){
        System.out.println("Screen down...");
    }
}
