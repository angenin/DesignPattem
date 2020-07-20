package com.angenin.prototype;

/**
 * @package_name: com.angenin.prototype
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/11 6:55 下午
 **/
public class Test {

    //原型模式测试
    public static void main(String[] args) {
        AAA aaa = new AAA(1);
        Sheep sheep1 = new Sheep("a1", 1, aaa);

        try{
            //浅拷贝（深拷贝方式一）测试
//            Sheep sheep2 = (Sheep) sheep1.clone();
//            Sheep sheep3 = (Sheep) sheep1.clone();
            //深拷贝方式二
            Sheep sheep2 = (Sheep) sheep1.deepClone();
            Sheep sheep3 = (Sheep) sheep1.deepClone();

            System.out.println(sheep1.hashCode());
            System.out.println(sheep2.hashCode());
            System.out.println(sheep3.hashCode());
            System.out.println("------------");
            System.out.println(aaa.hashCode());
            System.out.println(sheep1.getAAA().hashCode());
            System.out.println(sheep2.getAAA().hashCode());
            System.out.println(sheep3.getAAA().hashCode());

            //浅拷贝打印结果
//            1639705018
//            1627674070
//            1360875712
//            ------------
//            1625635731
//            1625635731
//            1625635731
//            1625635731

            //深拷贝方式一打印结果
//            1639705018
//            1627674070
//            1360875712
//            ------------
//            1625635731
//            1625635731
//            1580066828
//            491044090

            //深拷贝方式二打印结果
//            1872034366
//            317574433
//            885284298
//            ------------
//            1581781576
//            1581781576
//            1389133897
//            1534030866

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
