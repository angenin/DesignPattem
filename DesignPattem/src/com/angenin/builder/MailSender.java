package com.angenin.builder;

/**
 * @package_name: com.angenin.xxx.gongchangfangfa
 * @name: MailSender
 * @author: angenin
 * @dateTime: 2020/7/11 9:55 上午
 **/
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("mail");
    }
}
