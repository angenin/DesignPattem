package com.angenin.observer.observer;

/**
 * @package_name: com.angenin.observer
 * @name: CurrentConditions
 * @author: angenin
 * @dateTime: 2020/7/17 9:58 上午
 **/

//观察者
public class CurrentConditions implements Observer {

    private float temperature;  //温度
    private float pressure;     //压力
    private float humidity;     //湿度

    //更新天气情况
    @Override
    public void update(float temperature, float pressure, float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        display();
    }

    public void display(){
        System.out.println("***Today mTemperature: "+temperature+"***");
        System.out.println("***Today mPressure: "+pressure+"***");
        System.out.println("***Today mHumidity: "+humidity+"***");
    }
}
