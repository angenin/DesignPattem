package com.angenin.builder;

/**
 * @package_name: com.angenin.builder
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/11 6:08 下午
 **/
public class Test {

    //建造者模式
    public static void main(String[] args) {
        Builder builder = new Builder();
//        builder.produceMailSender(10);
        builder.produceSmsSender(5);
    }
}
