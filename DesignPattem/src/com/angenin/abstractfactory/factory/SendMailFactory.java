package com.angenin.abstractfactory.factory;

import com.angenin.abstractfactory.MailSender;
import com.angenin.abstractfactory.Sender;

/**
 * @package_name: com.angenin.Aabstractfactory
 * @name: SendMailFactory
 * @author: angenin
 * @dateTime: 2020/7/11 10:08 上午
 **/
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
