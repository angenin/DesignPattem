package com.angenin.factorymethod;

/**
 * @package_name: com.angenin.xxx.gongchangfangfa
 * @name: SmsSender
 * @author: angenin
 * @dateTime: 2020/7/11 9:55 上午
 **/
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("sms");
    }
}
