package com.desgin.study_01_simple_factory.class03;

/**
 * @author test_jia
 * ClassName Calculator
 * PackageName com.desgin.study_01_code_format.class03
 * Description
 * <p> 使用面向对象方式完成计算器 + - * /
 * 计算器类
 * Date: 2022/4/25
 * Time: 上午1:05
 */
public class Calculator {

    /**
     * 加法
     *
     * @param operand   操作数
     * @param operandBy 被操作数
     * @return 返回操作结果
     */
    public double add(double operand, double operandBy) {
        return operand + operandBy;
    }

    /**
     * 减法
     *
     * @param operand   操作数
     * @param operandBy 被操作数
     * @return 返回操作结果
     */
    public double subtraction(double operand, double operandBy) {
        return operand - operandBy;
    }

    /**
     * 乘法
     *
     * @param operand   操作数
     * @param operandBy 被操作数
     * @return 返回操作结果
     */
    public double multiplication(double operand, double operandBy) {
        return operand * operandBy;
    }
    /**
     * 除法
     *
     * @param operand   操作数
     * @param operandBy 被操作数
     * @return 返回操作结果
     */
    public double division(double operand, double operandBy) {
        if (operandBy == 0) {
            throw new RuntimeException("被除数不能为0");
        }
        return operand / operandBy;
    }
}
