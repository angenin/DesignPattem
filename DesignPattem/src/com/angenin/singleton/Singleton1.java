package com.angenin.singleton;

/**
 * @package_name: com.angenin.singleton
 * @name: Singleton1
 * @author: angenin
 * @dateTime: 2020/7/11 10:16 上午
 **/
//饿汉式
public class Singleton1 {
    //私有化构造器
    private Singleton1(){}

    //私有化静态实例
    //方法一：直接赋值
    private static Singleton1 instance =  new Singleton1();

    //方法二：静态代码块里赋值
//    static {
//        instance = new Singleton1();
//    }

    public static Singleton1 getInstance(){
        return instance;
    }
}
