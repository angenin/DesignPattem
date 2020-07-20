package com.angenin.adapter;

/**
 * @package_name: com.angenin.adapter.classadapter
 * @name: Voltage220V
 * @author: angenin
 * @dateTime: 2020/7/11 9:46 下午
 **/

//被适配的类
//插座
public class Voltage220V {
    //输出220V
    public int output220(){
        int src = 220;
        System.out.println("电压=" + src + "V");
        return src;
    }
}
