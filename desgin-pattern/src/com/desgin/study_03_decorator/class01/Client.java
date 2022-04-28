package com.desgin.study_03_decorator.class01;

/**
 * @author test_jia
 * ClassName Client
 * PackageName com.desgin.study_03_decorator.class01
 * Description
 * <p> 装饰器模式第一版，没有分清职责，也没有使用模式
 * Date: 2022/4/29
 * Time: 上午12:59
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("第一种装扮");
        Person person = new Person("test");
        person.tShirts();
        person.jeans();
        person.sportsShoes();
        person.show();

        System.out.println("第二种装扮");
        person.suit();
        person.tie();
        person.leatherShoes();
        person.show();
    }
}
