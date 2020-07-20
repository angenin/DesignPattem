package com.angenin.proxy.cglib;

/**
 * @package_name: com.angenin.proxy.cglib
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/13 4:02 下午
 **/
public class Test {

    //测试代理模式（cglib动态）
    public static void main(String[] args) {
        //创建目标对象（被代理对象）
        TeacherDao teacher = new TeacherDao();
        //创建代理对象，并指定被代理对象
        TeacherDao proxy = (TeacherDao) new ProxyFactory(teacher).getProxyInstance();

        //通过代理对象，调用被代理对象的方法
        String s = proxy.teach();
        System.out.println(s);
    }

}
