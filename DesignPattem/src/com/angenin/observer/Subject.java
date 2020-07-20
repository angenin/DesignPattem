package com.angenin.observer;

import com.angenin.observer.observer.Observer;

/**
 * @package_name: com.angenin.observer
 * @name: Subject
 * @author: angenin
 * @dateTime: 2020/7/17 10:26 上午
 **/
public interface Subject {

    //添加观察者
    public void registerObserver(Observer o);
    //移除观察者
    public void removeObserver(Observer o);
    //通知所有观察者
    public void notifyObserver();

}
