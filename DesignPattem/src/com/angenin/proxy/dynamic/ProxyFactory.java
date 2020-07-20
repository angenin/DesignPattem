package com.angenin.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @package_name: com.angenin.proxy.staticproxy
 * @name: TeacherDaoProxy
 * @author: angenin
 * @dateTime: 2020/7/13 11:37 上午
 **/

//代理类（JDK动态代理）
public class ProxyFactory {

    private Object target;    //目标对象

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回target的代理对象
    public Object getProxyInstance(){

        /**
         *     public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h)
         *
         *      第一个参数（loader）：指定被代理对象使用的类加载器（固定写法 xxx.getClass().getClassLoader() ）
         *      第二个参数（interfaces）：指定被代理对象实现的接口类型（固定写法 xxx.getClass().getInterfaces() ）
         *      第三个参数（h）：事件处理，执行被代理对象方法时，会触发事情处理器方法（new InvocationHandler() ）
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    //method：被代理对象执行的方法
                    //args：被代理对象执行的方法参数
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始...");
                        //被代理对象方法执行后的返回结果
                        Object returnVal = method.invoke(target, args);
                        System.out.println("JDK代理结束");
                        return returnVal;
                    }
                });
    }
}
