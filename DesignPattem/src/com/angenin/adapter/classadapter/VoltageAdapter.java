package com.angenin.adapter.classadapter;

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
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int srcV = output220();
        //降压，转成5V
        int dstV = srcV / 44;
        return dstV;
    }
}
