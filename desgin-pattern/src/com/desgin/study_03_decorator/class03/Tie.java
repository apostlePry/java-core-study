package com.desgin.study_03_decorator.class03;

/**
 * @author test_jia
 * ClassName Tie
 * PackageName com.desgin.study_03_decorator.class02
 * Description
 * <p>
 * Date: 2022/4/29
 * Time: 上午1:06
 */
public class Tie extends Decorator {

    public void show() {
        System.out.print("打领带 ");
        if (base != null)
            base.show();
    }
}
