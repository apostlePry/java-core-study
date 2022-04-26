package com.desgin.study_01_simple_factory.class04;

import java.util.Scanner;

/**
 * @author test_jia
 * ClassName Sutdy_04_Calculator
 * PackageName com.desgin.study_01_code_format.class04
 * Description
 * <p> 使用简单工厂模式，以及继承实现操作分离
 * Date: 2022/4/25
 * Time: 上午1:30
 */
public class Study_04_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要计算的第一个数字: ");
        double operand = scanner.nextDouble();
        System.out.println("请输入计算符号(+ - * /: ");
        String operator = scanner.next();
        System.out.println("请输入需要计算的第二个数字: ");
        double operandBy = scanner.nextInt();
        System.out.println("开始计算: ");
        Calculator calculator = CalculatorFactory.createCalculator(operator);
        if (calculator != null) {
            calculator.setOperand(operand);
            calculator.setOperandBy(operandBy);
            double res = calculator.operator();
            System.out.println("计算结果是: " + res);
        }
    }
}
