package com.desgin.study_03_decorator.class03;

/**
 * @author test_jia
 * ClassName LeatherShoes
 * PackageName com.desgin.study_03_decorator.class02
 * Description
 * <p>
 * Date: 2022/4/29
 * Time: 上午1:06
 */
public class LeatherShoes extends Decorator {

    public void show() {
        System.out.print("穿皮鞋 ");
        if (base != null) {
            base.show();
        }
    }
}
