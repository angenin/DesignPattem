package com.angenin.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @package_name: com.angenin.proxy.cglib
 * @name: ProxyFactory
 * @author: angenin
 * @dateTime: 2020/7/13 3:33 下午
 **/
public class ProxyFactory implements MethodInterceptor {

    //被代理对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回target的代理对象
    public Object getProxyInstance(){
        //1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置回调函数
        enhancer.setCallback(this);
        //4. 创建子类对象，即代理对象
        return enhancer.create();
    }

    //重写intercept方法，会调用被代理对象的方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理开始...");
        Object returnVal = method.invoke(target, objects);
        System.out.println("cglib代理结束");
        return returnVal;
    }
}
