package com.desgin.study_04_static_proxy.class03;

/**
 * @author test_jia
 * ClassName Client
 * PackageName com.desgin.study_04_proxy.class03
 * Description
 * <p> 符合真实场景的代理模式，追求者，追求者朋友，女孩，三方都存在
 * Date: 2022/5/16
 * Time: 上午2:12
 */
public class Client {

    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl("薇拉 绯耀");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.sendDoll();
        proxy.sendFlowers();
        proxy.sendChocolate();
    }
}
