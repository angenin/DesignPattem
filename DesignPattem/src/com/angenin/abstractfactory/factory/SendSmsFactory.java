package com.angenin.abstractfactory.factory;

import com.angenin.abstractfactory.Sender;
import com.angenin.abstractfactory.SmsSender;

/**
 * @package_name: com.angenin.Aabstractfactory
 * @name: SendSmsFactory
 * @author: angenin
 * @dateTime: 2020/7/11 10:09 上午
 **/
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
