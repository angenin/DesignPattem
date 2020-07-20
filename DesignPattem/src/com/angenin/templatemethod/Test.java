package com.angenin.templatemethod;

/**
 * @package_name: com.angenin.templatemethod
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/13 7:03 下午
 **/
public class Test {

    //测试模板方法模式
    public static void main(String[] args) {
        // 制作红豆豆浆
        System.out.println("-----制作红豆豆浆-----");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("====================");

        // 制作花生豆浆
        System.out.println("-----制作花生豆浆-----");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }
}
