package com.desgin.study_01_simple_factory.class01;

import java.util.Scanner;

/**
 * @author test_jia
 * ClassName Study_01_jisuanqi
 * PackageName com.desgin.study_01_geshi
 * Description
 * <p> 计算器实现1 完成加、减、乘、除的实现
 *
 * Date: 2022/4/25
 * Time: 上午12:43
 */
public class Study_01_Calculator {

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
        // 问题一: 用if else 判断，会增加大量判断代码
        if ("+".equals(operator)) {
            res = operand + operandBy;
        } else if ("-".equals(operator)) {
            res = operand - operandBy;
        } else if ("*".equals(operator)) {
            res = operand * operandBy;
        } else if ("/".equals(operator)) {
            // 问题2： 如果被操作数为0, 那么除法将会无法获取结果
            res = operand / operandBy;
        } else {
            System.out.println("操作符号错误，只能计算+ - * /!, 当前操作符号为: " + operator);
            return;
        }
        System.out.println("计算结果: " + res);

    }
}
