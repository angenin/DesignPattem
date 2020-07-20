package com.angenin.facade;

/**
 * @package_name: com.angenin.facade
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/12 10:46 下午
 **/
public class Test {

    //测试外观模式/门面模式
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.ready();
        System.out.println("------------");
        homeTheaterFacade.play();
        System.out.println("------------");
        homeTheaterFacade.pause();
        System.out.println("------------");
        homeTheaterFacade.play();
        System.out.println("------------");
        homeTheaterFacade.end();
    }
}
