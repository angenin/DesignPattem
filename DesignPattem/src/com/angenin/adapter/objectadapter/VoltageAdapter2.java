package com.angenin.adapter.objectadapter;

import com.angenin.adapter.IVoltage5V;
import com.angenin.adapter.Voltage220V;

/**
 * @package_name: com.angenin.adapter.classadapter
 * @name: VoltageAdapter
 * @author: angenin
 * @dateTime: 2020/7/11 9:46 下午
 **/

//手机充电头
//适配器
public class VoltageAdapter2 implements IVoltage5V {

    private Voltage220V voltage220V = null;

    public VoltageAdapter2(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dstV = 0;
        if (null != voltage220V){
            int srcV = voltage220V.output220();
            //降压，转成5V
            dstV = srcV / 44;
        }else{
            System.out.println("适配错误，电压为" + dstV + "V");
        }
        return dstV;
    }
}
