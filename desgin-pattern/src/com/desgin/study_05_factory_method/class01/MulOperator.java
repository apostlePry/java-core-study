package com.desgin.study_05_factory_method.class01;

/**
 * @author test_jia
 * ClassName MulOperator
 * PackageName com.desgin.study_05_factory_method.class01
 * Description
 * <p>
 * Date: 2022/5/17
 * Time: 上午1:35
 */
public class MulOperator implements Operator {
    @Override
    public double operate(double arg1, double arg2) {
        return arg1 * arg2;
    }
}
