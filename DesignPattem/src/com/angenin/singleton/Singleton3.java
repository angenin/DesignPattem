package com.angenin.singleton;

/**
 * @package_name: com.angenin.singleton
 * @name: Singleton3
 * @author: angenin
 * @dateTime: 2020/7/11 3:46 下午
 **/

//内部类
public class Singleton3 {

    private static class CreateSingleton3 {
        private static Singleton3 instance = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return CreateSingleton3.instance;
    }

}
