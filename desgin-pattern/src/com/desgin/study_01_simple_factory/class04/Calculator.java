package com.desgin.study_01_simple_factory.class04;

/**
 * @author test_jia
 * ClassName Calculator
 * PackageName com.desgin.study_01_code_format.class04
 * Description
 * <p> 计算器基类，定义两个操作数，通过继承实现 + - * /
 * Date: 2022/4/25
 * Time: 上午1:22
 */
public class Calculator {

    protected double operand;
    protected double operandBy;

    public double getOperand() {
        return operand;
    }

    public void setOperand(double operand) {
        this.operand = operand;
    }

    public double getOperandBy() {
        return operandBy;
    }

    public void setOperandBy(double operandBy) {
        this.operandBy = operandBy;
    }

    public double operator() {
        return 0.0;
    }
}
