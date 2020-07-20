package com.angenin.adapter;

/**
 * @package_name: com.angenin.adapter.classadapter
 * @name: Phome
 * @author: angenin
 * @dateTime: 2020/7/11 9:56 下午
 **/

//手机类
public class Phone {

    //充电
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("电压为5V，充电中...");
        }else if(iVoltage5V.output5V() > 5){
            System.out.println("电压过高，无法充电...");
        }
    }

}
