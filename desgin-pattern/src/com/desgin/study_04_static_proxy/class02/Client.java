package com.desgin.study_04_static_proxy.class02;

/**
 * @author test_jia
 * ClassName Client
 * PackageName com.desgin.study_04_proxy.class02
 * Description
 * <p> 错误的使用二，只有代理人，没有真实对象。
 * Date: 2022/5/16
 * Time: 上午2:07
 */
public class Client {

    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl("露娜");
        Proxy proxy = new Proxy(schoolGirl);

        proxy.sendDoll();
        proxy.sendFlowers();
        proxy.sendChocolate();
    }
}
