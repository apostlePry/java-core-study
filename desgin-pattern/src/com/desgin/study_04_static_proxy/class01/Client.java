package com.desgin.study_04_static_proxy.class01;

/**
 * @author test_jia
 * ClassName Client
 * PackageName com.desgin.study_04_proxy.class01
 * Description
 * <p> 代理模式一，错误的使用，没有代理类，直接使用真实对象处理目标对象业务。
 * Date: 2022/5/16
 * Time: 上午1:59
 */
public class Client {

    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl("芬尼");
        Pursuit pursuit = new Pursuit(schoolGirl);

        pursuit.sendDoll();
        pursuit.sendFlowers();
        pursuit.sendChocolate();
    }
}
