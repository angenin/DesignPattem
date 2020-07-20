package com.angenin.facade;

import com.angenin.facade.hometheater.*;

/**
 * @package_name: com.angenin.facade
 * @name: HomeTheaterFacade
 * @author: angenin
 * @dateTime: 2020/7/17 9:51 下午
 **/
public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;


    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }

    //准备
    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    //播放
    public void play(){
        dvdPlayer.play();
    }

    //暂停
    public void pause(){
        dvdPlayer.pause();
    }

    //结束
    public void end(){
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
