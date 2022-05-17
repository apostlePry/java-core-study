package com.desgin.study_05_factory_method.class01;

import com.sun.xml.internal.rngom.ast.builder.Div;

import java.util.Scanner;

/**
 * @author test_jia
 * ClassName Client
 * PackageName com.desgin.study_05_factory_method.class01
 * Description
 * <p>
 * Date: 2022/5/17
 * Time: 上午1:37
 */
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要计算的第一个数字: ");
        double operand = scanner.nextDouble();
        System.out.println("请输入需要计算的第二个数字: ");
        double operandBy = scanner.nextInt();
        System.out.println("开始计算: ");
        OperatorFactory factory = new MulFactory();
        Operator operator = factory.createFactory();
        double result = operator.operate(operand, operandBy);
        System.out.println("计算结果是: " + result);
    }
}
