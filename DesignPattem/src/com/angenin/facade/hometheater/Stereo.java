package com.angenin.facade.hometheater;

/**
 * @package_name: com.angenin.facade
 * @name: DVDPlayer
 * @author: angenin
 * @dateTime: 2020/7/17 9:36 下午
 **/

//立体声类
public class Stereo {

    private static final Stereo instance = new Stereo();

    public static Stereo getInstance(){
        return instance;
    }

    public void up(){
        System.out.println("Stereo up...");
    }
    public void on(){
        System.out.println("Stereo on...");
    }
    public void off(){
        System.out.println("Stereo off...");
    }
}
