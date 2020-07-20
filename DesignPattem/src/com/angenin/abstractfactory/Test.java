package com.angenin.abstractfactory;

import com.angenin.abstractfactory.factory.SendSmsFactory;

/**
 * @package_name: com.angenin.xxx.gongchangfangfa
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/11 9:58 上午
 **/
public class Test {

    //抽象工厂模式测试
    public static void main(String[] args) {
//        SendMailFactory factory = new SendMailFactory();
        SendSmsFactory factory = new SendSmsFactory();
        Sender sender = factory.produce();
        sender.Send();
    }
}
