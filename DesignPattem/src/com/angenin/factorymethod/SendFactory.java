package com.angenin.factorymethod;

/**
 * @package_name: com.angenin.xxx.gongchangfangfa
 * @name: SendFactory
 * @author: angenin
 * @dateTime: 2020/7/11 9:56 上午
 **/
public class SendFactory {

    //简单工厂
//    public Sender produce(String type){
//        if("mail".equals(type)){
//            return new MailSender();
//        }else if("sms".equals(type)){
//            return new SmsSender();
//        }else {
//            System.out.println("请输入正确的类型!");
//            return null;
//        }
//    }


    //工厂方法
//    public Sender produceMail(){
//        return new MailSender();
//    }
//
//    public Sender produceSms(){
//        return new SmsSender();
//    }

    //静态工厂方法
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }

}
