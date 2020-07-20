package com.angenin.flyweight;

/**
 * @package_name: com.angenin.flyweight
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/13 10:56 上午
 **/
public class Test {

    //测试享元模式
    public static void main(String[] args) {
        //创建一个工厂
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        //客户要一个以新闻形式发布的网站
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("新闻");
        webSite1.use(new User("user1"));
        //客户要一个以博客形式发布的网站
        WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");
        webSite2.use(new User("user2"));
        //客户要一个以博客形式发布的网站
        WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客");
        webSite3.use(new User("user3"));

        System.out.println("网站类型的总数：" + webSiteFactory.getWebSiteCount());
    }
}
