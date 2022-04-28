package com.desgin.study_03_decorator.class02;

/**
 * @author test_jia
 * ClassName Person
 * PackageName com.desgin.study_03_decorator.class02
 * Description
 * <p>
 * Date: 2022/4/29
 * Time: 上午1:02
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的: " + name);
    }
}
