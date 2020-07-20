package com.angenin.templatemethod;

/**
 * @package_name: com.angenin.templatemethod
 * @name: SoyaMilk
 * @author: angenin
 * @dateTime: 2020/7/13 6:48 下午
 **/

//豆浆类
public abstract class SoyaMilk {

    //模板方法，final不让子类覆盖
    public final void make(){
        //豆浆制作步骤
        select();
        addCondiments();
        soak();
        beat();
    }

    //选材料
    private void select(){
        System.out.println("选择好的新鲜的黄豆");
    }

    //添加不同的配料，由子类具体实现
    public abstract void addCondiments();

    //浸泡
    private void soak(){
        System.out.println("浸泡三小时");
    }

    //捣碎
    private void beat(){
        System.out.println("然后放到豆浆机里捣碎");
    }

}
