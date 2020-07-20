package com.angenin.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @package_name: com.angenin.builder
 * @name: Builder
 * @author: angenin
 * @dateTime: 2020/7/11 3:51 下午
 **/
public class Builder {

    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }

}
