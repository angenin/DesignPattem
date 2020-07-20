package com.angenin.prototype;

import java.io.*;
import java.util.Objects;

/**
 * @package_name: com.angenin.prototype
 * @name: Sheep
 * @author: angenin
 * @dateTime: 2020/7/11 6:52 下午
 **/
public class Sheep implements Cloneable, Serializable {

    private String name;
    private int age;
    private AAA aaa;    //测试引用类型

    //浅拷贝（需要实现Cloneable）
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        //只能对象基本类型和string类型进行拷贝，其他类型这是赋值地址值，其他类型的属性一修改，所有的对象都会被影响
//        Sheep sheep = (Sheep) super.clone();
//        return sheep;
//    }

    //深拷贝方法一：clone（需要实现Cloneable）
    //深拷贝的引用类型也需要实现Cloneable并重新clone方法
    //需要对每个引用类型的属性的类进行实现Cloneable并重写clone，不方便，而且如果是对已存在的类，进违背了cop原则
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        //先对基本类型进行拷贝（先进行浅拷贝）
//        Sheep sheep = (Sheep) super.clone();
//
//        //对象引用类型的属性进行单独处理
//        sheep.aaa = (AAA) aaa.clone();
//
//        return sheep;
//    }

    //深拷贝方法二：系列化（需要实现Serializable）
    //深拷贝的引用类型也需要实现Serializable
    public Object deepClone() throws Exception {
        /* 写入当前对象的二进制流 */
        //系列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);  //当前这个对象以对象流的方式输出

        /* 读出二进制流产生的新对象 */
        //反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep sheep = (Sheep) ois.readObject();     //读取对象

        bos.close();
        oos.close();
        bis.close();
        ois.close();

        return sheep;
    }


    public Sheep() {
    }

    public Sheep(String name, int age, AAA aaa) {
        this.name = name;
        this.age = age;
        this.aaa = aaa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AAA getAAA() {
        return aaa;
    }

    public void setAAA(AAA aaa) {
        this.aaa = aaa;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", aaa=" + aaa +
                '}';
    }
}
