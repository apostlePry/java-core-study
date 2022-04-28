package com.desgin.study_03_decorator.class03;

/**
 * @author test_jia
 * ClassName Client
 * PackageName com.desgin.study_03_decorator.class02
 * Description
 * <p> 装饰器模式第二版 划分职责，使用装饰器模式自由组装
 * Date: 2022/4/29
 * Time: 上午1:07
 */
public class Client {

    public static void main(String[] args) {
        Person person = new Person("test");
        System.out.println("第一种装扮: ");
        TShirts tShirts = new TShirts();
        tShirts.decorator(person);
        Jeans jeans = new Jeans();
        jeans.decorator(tShirts);
        SportsShoes sportsShoes = new SportsShoes();
        sportsShoes.decorator(jeans);
        sportsShoes.show();

        System.out.println("第二种装扮: ");
        Suit suit = new Suit();
        suit.decorator(person);
        Tie tie = new Tie();
        tie.decorator(suit);
        LeatherShoes leatherShoes = new LeatherShoes();
        leatherShoes.decorator(tie);
        leatherShoes.show();
    }
}
