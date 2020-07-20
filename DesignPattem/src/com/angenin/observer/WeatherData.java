package com.angenin.observer;

import com.angenin.observer.observer.Observer;

import java.util.ArrayList;

/**
 * @package_name: com.angenin.observer
 * @name: WeatherData
 * @author: angenin
 * @dateTime: 2020/7/17 9:59 上午
 **/

//气象台
public class WeatherData implements Subject {

    private float temperature;  //温度
    private float pressure;     //压力
    private float humidity;     //湿度
    private ArrayList<Observer> observers;   //观察者结合

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    public void dataChange() {
        notifyObserver();
    }

    //添加一个观察者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    //移除一个观察者
    @Override
    public void removeObserver(Observer o) {
        //observers里是否包含o对象
        if (observers.contains(o)){
            observers.remove(o);
        }
    }

    //遍历所有观察者并通知
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperature, this.pressure, this.humidity);
        }
    }
}
