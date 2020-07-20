package com.angenin.adapter;

import com.angenin.adapter.classadapter.VoltageAdapter;
import com.angenin.adapter.interfaceadapter.AbsAdapter;
import com.angenin.adapter.interfaceadapter.Interface4M;
import com.angenin.adapter.objectadapter.VoltageAdapter2;

/**
 * @package_name: com.angenin.adapter.classadapter
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/11 9:59 下午
 **/
public class Test {

    //测试适配器模式
    public static void main(String[] args) {

        // 测试类适配器
//        Phone phone = new Phone();
//        phone.charging(new VoltageAdapter());
        // 测试对象适配器
//        Phone phone = new Phone();
//        phone.charging(new VoltageAdapter2(new Voltage220V()));
        // 测试接口适配器
        AbsAdapter adapter =
            new AbsAdapter() {
                //只重写了m1方法
                @Override
                public void m1() {
                    System.out.println("使用m1方法");
                }
            };

        adapter.m1();

    }
}
