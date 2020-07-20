package com.angenin.observer.observer;

/**
 * @package_name: com.angenin.observer
 * @name: Observer
 * @author: angenin
 * @dateTime: 2020/7/17 10:27 上午
 **/

//观察者接口
public interface Observer {

    public void update(float temperature, float pressure, float humidity);

}
