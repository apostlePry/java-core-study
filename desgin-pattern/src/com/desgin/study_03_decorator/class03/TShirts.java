package com.desgin.study_03_decorator.class03;

/**
 * @author test_jia
 * ClassName TShirts
 * PackageName com.desgin.study_03_decorator.class02
 * Description
 * <p>
 * Date: 2022/4/29
 * Time: 上午1:04
 */
public class TShirts extends Decorator {

    public void show() {
        System.out.print("穿T恤 ");
        if (base != null)
            base.show();
    }
}
