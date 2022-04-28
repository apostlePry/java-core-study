package com.desgin.study_03_decorator.class03;

/**
 * @author test_jia
 * ClassName Jeans
 * PackageName com.desgin.study_03_decorator.class02
 * Description
 * <p>
 * Date: 2022/4/29
 * Time: 上午1:04
 */
public class Jeans extends Decorator {

    public void show() {
        System.out.print("穿牛仔裤 ");
        if (base != null) {
            base.show();
        }
    }
}
