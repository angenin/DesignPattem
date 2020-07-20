package com.angenin.proxy.dynamic;

import com.angenin.proxy.teacher.ITeacherDao;
import com.angenin.proxy.teacher.TeacherDao;

/**
 * @package_name: com.angenin.proxy.staticproxy
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/13 11:43 上午
 **/
public class Test {

    //测试代理模式（JDK动态）
    public static void main(String[] args) {
        //创建目标对象（被代理对象）
        ITeacherDao teacher = new TeacherDao();
        //创建代理对象，并指定被代理对象
        ITeacherDao proxy = (ITeacherDao) new ProxyFactory(teacher).getProxyInstance();

        //通过代理对象，调用被代理对象的方法
        proxy.teach();
    }
}
