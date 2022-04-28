package com.desgin.study_03_decorator.class01;

/**
 * @author test_jia
 * ClassName Person
 * PackageName com.desgin.study_03_decorator.class01
 * Description
 * <p>
 * Date: 2022/4/29
 * Time: 上午12:55
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void tShirts() {
        System.out.print("穿T恤 ");
    }

    public void jeans() {
        System.out.print("穿牛仔裤 ");
    }

    public void sportsShoes() {
        System.out.print("穿运动鞋 ");
    }

    public void suit() {
        System.out.print("穿西装 ");
    }

    public void tie() {
        System.out.print("打领带 ");
    }

    public void leatherShoes() {
        System.out.print("穿皮鞋 ");
    }

    public void show() {
        System.out.println("装扮的: " + name);
    }
}
