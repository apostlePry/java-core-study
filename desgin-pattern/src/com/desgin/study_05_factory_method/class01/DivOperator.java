package com.desgin.study_05_factory_method.class01;

/**
 * @author test_jia
 * ClassName DivOperator
 * PackageName com.desgin.study_05_factory_method.class01
 * Description
 * <p>
 * Date: 2022/5/17
 * Time: 上午1:35
 */
public class DivOperator implements Operator {
    @Override
    public double operate(double arg1, double arg2) {
        if (arg2 == 0) {
            System.out.println("被除数不能为0");
            return 0.0;
        }
        return arg1 / arg2;
    }
}
