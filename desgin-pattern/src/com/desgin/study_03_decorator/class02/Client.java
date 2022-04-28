package com.desgin.study_03_decorator.class02;

/**
 * @author test_jia
 * ClassName Client
 * PackageName com.desgin.study_03_decorator.class02
 * Description
 * <p> 装饰器模式第二版 划分职责，但是需要在客户端组装
 * Date: 2022/4/29
 * Time: 上午1:07
 */
public class Client {

    public static void main(String[] args) {
        Person person = new Person("test");
        System.out.println("第一种装扮: ");
        new TShirts().show();
        new Jeans().show();
        new SportsShoes().show();
        person.show();

        System.out.println("第二种装扮: ");
        new Suit().show();
        new Tie().show();
        new LeatherShoes().show();
        person.show();
    }
}
