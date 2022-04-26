package com.desgin.study_01_simple_factory.class04;

/**
 * @author test_jia
 * ClassName CalculatorAdd
 * PackageName com.desgin.study_01_code_format.class04
 * Description
 * <p> 加法计算类
 * Date: 2022/4/25
 * Time: 上午1:23
 */
public class CalculatorMultiplication extends Calculator {

    public double operator() {
        return this.operand * this.operandBy;
    }

}
