package com.desgin.study_01_simple_factory.class03;

import java.util.Scanner;

/**
 * @author test_jia
 * ClassName Study_03_Calculator
 * PackageName com.desgin.study_01_code_format.class03
 * Description
 * <p> 计算器实现3，使用面向对象完成计算器的实现
 * 还会有一些问题，如果单独改一个计算方式，或者增加计算方法，需要修改计算器类的代码，如何解决呢？
 * Date: 2022/4/25
 * Time: 上午1:09
 */
public class Study_03_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要计算的第一个数字: ");
        double operand = scanner.nextDouble();
        System.out.println("请输入计算符号(+ - * /: ");
        String operator = scanner.next();
        System.out.println("请输入需要计算的第二个数字: ");
        double operandBy = scanner.nextInt();
        System.out.println("开始计算: ");
        double res = 0.0;
        Calculator calculator = new Calculator();
        switch (operator) {
            case "+":
                res = calculator.add(operand, operandBy);
                break;
            case "-":
                res = calculator.subtraction(operand, operandBy);
                break;
            case "*":
                res = calculator.multiplication(operand,operandBy);
                break;
            case "/":
                res = calculator.division(operand, operandBy);
                break;
            default:
                System.out.println("计算符号错误，只能是 + - * / 四个符号中的一个, 当前符号: " + operator);
                return;
        }
        System.out.println("当前结果是: " + res);
    }
}
