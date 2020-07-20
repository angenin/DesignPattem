package com.angenin.factorymethod;

/**
 * @package_name: com.angenin.xxx.gongchangfangfa
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/11 9:58 上午
 **/
public class Test {

    //工厂方法模式测试
    public static void main(String[] args) {
        //简单工厂测试
//        SendFactory factory = new SendFactory();
//        Sender sender = factory.produce("sms");
//        sender.Send();
        //工厂方法测试
//        SendFactory factory = new SendFactory();
//        //Sender sender = factory.produceMail();
//        Sender sender = factory.produceSms();
//        sender.Send();
        //静态工厂方法参数
        //Sender sender = SendFactory.produceMail();
        Sender sender = SendFactory.produceSms();
        sender.Send();
    }
}
