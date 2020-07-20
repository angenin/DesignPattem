package com.angenin.observer;

import com.angenin.observer.observer.BaiduSite;
import com.angenin.observer.observer.CurrentConditions;

/**
 * @package_name: com.angenin.observer
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/17 10:00 上午
 **/
public class Test {

    //测试观察者模式
    public static void main(String[] args) {
        //创建气象台
        WeatherData weatherData = new WeatherData();

        //创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();

        //添加观察者
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);

        //更改天气信息
        weatherData.setData(30.0f, 150.0f, 40.0f);
        System.out.println("=================");
        //移除观察者
        weatherData.registerObserver(baiduSite);

        //更改天气信息
        weatherData.setData(38.0f, 130.0f, 50.0f);
    }
}
