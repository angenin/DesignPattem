package com.angenin.proxy.staticproxy;

import com.angenin.proxy.teacher.ITeacherDao;

/**
 * @package_name: com.angenin.proxy.staticproxy
 * @name: TeacherDaoProxy
 * @author: angenin
 * @dateTime: 2020/7/13 11:37 上午
 **/

//教师代理类（静态代理）
public class TeacherDaoProxy implements ITeacherDao {

    //目标对象（被代理教师对象），通过接口来聚合
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        //增强被代理对象
        System.out.println("代理对象开始代理");
        target.teach();
        System.out.println("代理结束");
    }
}
