package com.angenin.flyweight;

/**
 * @package_name: com.angenin.flyweight
 * @name: ConcreteWebSite
 * @author: angenin
 * @dateTime: 2020/7/13 10:44 上午
 **/

//具体网站（内部状态）
public class ConcreteWebSite extends WebSite {

    private String type = "";   //网站发布的形式（类型）

    public ConcreteWebSite(String type){
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站发布的形式：" + type + " ---->【" + user.getName() + "】使用中...");
    }
}
