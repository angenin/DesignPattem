package com.angenin.bridge;

import com.angenin.bridge.phonetype.FoldedPhone;
import com.angenin.bridge.phonetype.UpRightPhone;

/**
 * @package_name: com.angenin.bridge
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/12 11:26 上午
 **/
public class Test {

    //测试桥接模式
    public static void main(String[] args) {
        //折叠式小米手机
        FoldedPhone xiaomiPhone = new FoldedPhone(new XiaoMi());
        xiaomiPhone.open();
        xiaomiPhone.call();

        System.out.println("==========");

        //折叠式vivo手机
        FoldedPhone vivoPhone = new FoldedPhone(new Vivo());
        vivoPhone.open();
        vivoPhone.close();

        System.out.println("-----------");

        //直立式小米手机
        UpRightPhone xiaomiPhone2 = new UpRightPhone(new XiaoMi());
        xiaomiPhone2.open();
        xiaomiPhone2.call();
        xiaomiPhone2.close();
    }
}
