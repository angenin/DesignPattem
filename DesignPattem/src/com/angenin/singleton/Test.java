package com.angenin.singleton;

/**
 * @package_name: com.angenin.singleton
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/18 7:16 下午
 **/
public class Test {

    //测试单例模式
    public static void main(String[] args) {
        //饿汉式
        Singleton1 singleton11 = Singleton1.getInstance();
        Singleton1 singleton12 = Singleton1.getInstance();
        System.out.println("singleton11 == singleton12 => " + (singleton11 == singleton12));

        //懒汉式
        Singleton2 singleton21 = Singleton2.getInstance();
        Singleton2 singleton22 = Singleton2.getInstance();
        System.out.println("singleton21 == singleton22 => " + (singleton21 == singleton22));

        //内部类
        Singleton3 singleton31 = Singleton3.getInstance();
        Singleton3 singleton32 = Singleton3.getInstance();
        System.out.println("singleton31 == singleton32 => " + (singleton31 == singleton32));

        //枚举
        Singleton4 singleton41 = Singleton4.INTERFACE;
        Singleton4 singleton42 = Singleton4.INTERFACE;
        System.out.println("singleton41 == singleton42 => " + (singleton41 == singleton42));

    }

}
