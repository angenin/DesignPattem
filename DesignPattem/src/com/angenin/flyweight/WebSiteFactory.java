package com.angenin.flyweight;

import java.util.HashMap;

/**
 * @package_name: com.angenin.flyweight
 * @name: WebSiteFactory
 * @author: angenin
 * @dateTime: 2020/7/13 10:48 上午
 **/

//网站工厂类
public class WebSiteFactory {

    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    //根据网站的类型，返回一个网站
    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){
            //如果没有就创建并保存到池中再返回
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite)pool.get(type);
    }

    //获取网站分类的总数（池中的总数）
    public int getWebSiteCount(){
        return pool.size();
    }
}
