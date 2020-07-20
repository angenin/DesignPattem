package com.angenin.singleton;

/**
 * @package_name: com.angenin.singleton
 * @name: Singleton2
 * @author: angenin
 * @dateTime: 2020/7/11 11:50 上午
 **/
//懒汉式
public class Singleton2 {

    //构造器私有化
    private Singleton2(){}

    //私有化静态实例，加 volatile 防止指令重新排序（如果使用双重检查，volatile必须加上）
    private static volatile Singleton2 instance =  null;

    //方法一：存在线程安全问题
//    public static Singleton2 getInstance(){
//        if (instance == null){
//            instance = new Singleton2();
//        }
//        return instance;
//    }

    //方法二：在方法上synchronized加锁，解决了线程安全问题，但是性能上会有所下降
//    public static synchronized Singleton2 getInstance(){
//        if (instance == null){
//            instance = new Singleton2();
//        }
//        return instance;
//    }

    //方法三：双重检查，在方法内加锁，比方法二性能有一定的提升
    public static Singleton2 getInstance(){
        if (instance == null){
            synchronized (Singleton2.class) {
                if(instance == null){
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
