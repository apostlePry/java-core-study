package com.desgin.study_01_simple_factory.class04;

/**
 * @author test_jia
 * ClassName CalculatorFactory
 * PackageName com.desgin.study_01_code_format.class04
 * Description 通过简单工厂创建计算器对象
 * <p>
 * Date: 2022/4/25
 * Time: 上午1:27
 */
public class CalculatorFactory {

    /**
     * 根据操作符号创建对应计算器对象
     * @param operator 操作符
     * @return 计算器对象
     */
    public static Calculator createCalculator(String operator) {
        Calculator calculator = null;
        switch (operator) {
            case "+":
                calculator = new CalculatorAdd();
                break;
            case "-":
                calculator = new CalculatorSubtraction();
                break;
            case "*":
                calculator = new CalculatorMultiplication();
                break;
            case "/":
                calculator = new CalculatorDivision();
                break;
            default:
                System.out.println("操作符号错误，目前只支持 + - * /！");
        }
        return calculator;
    }
}
