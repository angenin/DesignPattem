package com.angenin.facade.hometheater;

/**
 * @package_name: com.angenin.facade
 * @name: DVDPlayer
 * @author: angenin
 * @dateTime: 2020/7/17 9:36 下午
 **/

//DVD类
public class DVDPlayer {

    private static final DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("dvd on...");
    }
    public void off(){
        System.out.println("dvd off...");
    }
    public void play(){
        System.out.println("dvd is playing...");
    }
    public void pause(){
        System.out.println("dvd pause...");
    }
}
