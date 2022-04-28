package com.desgin.study_03_decorator.class03;

/**
 * @author test_jia
 * ClassName Decorator
 * PackageName com.desgin.study_03_decorator.class03
 * Description
 * <p>
 * Date: 2022/4/29
 * Time: 上午1:10
 */
public class Decorator extends Person {
    protected Person base;

    public void decorator(Person base) {
        this.base = base;
    }

    public void show(){
        if (base != null)
            base.show();
    }
}
