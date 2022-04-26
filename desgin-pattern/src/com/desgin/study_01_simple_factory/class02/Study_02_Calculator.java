package com.desgin.study_01_simple_factory.class02;

import java.util.Scanner;

/**
 * @author test_jia
 * ClassName Study_02_Calculator
 * PackageName com.desgin.study_01_code_format
 * Description
 * <p> 计算器实现二
 * Date: 2022/4/25
 * Time: 上午12:57
 */
public class Study_02_Calculator {

    public static void main(String[] args) {
        // 整个问题： 虽然计算没有问题了，但是代码可维护性阅读性不好，尝试使用面向对象方式完成计算器的计算
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要计算的第一个数字: ");
        double operand = scanner.nextDouble();
        System.out.println("请输入计算符号(+ - * /: ");
        String operator = scanner.next();
        System.out.println("请输入需要计算的第二个数字: ");
        double operandBy = scanner.nextInt();
        System.out.println("开始计算: ");
        double res = 0.0;
        switch (operator) {
            case "+":
                res = operand + operandBy;
                break;
            case "-":
                res = operand - operandBy;
                break;
            case "*":
                res = operand * operandBy;
                break;
            case "/":
                if (operandBy == 0) {
                    System.out.println("除法计算时，被操作数不能为0!");
                    return;
                }
                res = operand / operandBy;
                break;
            default:
                System.out.println("计算符号错误，只能使用+ - * / 进行计算，当前操作符为: " + operator);
                return;
        }
        System.out.println("计算结果为: " + res);
    }
}
