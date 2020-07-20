package com.angenin.abstractfactory.factory;

import com.angenin.abstractfactory.Sender;

/**
 * @package_name: com.angenin.Aabstractfactory
 * @name: Provider
 * @author: angenin
 * @dateTime: 2020/7/11 10:08 上午
 **/
public interface Provider {
    public Sender produce();
}
