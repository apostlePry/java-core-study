package com.desgin.study_02_strategy.class03;

/**
 * @author test_jia
 * ClassName ProductFactory
 * PackageName com.desgin.study_02_strategy.class02
 * Description
 * <p> 策略模式，提供一个对外的接口，来访问原本商品价格计算的方法，
 * 然后加上简单工厂模式，使得创建不同方式价格计算在策略内部实现。
 * Date: 2022/4/27
 * Time: 上午12:21
 */
public class Context {

    private Calculate calculate = null;

    public Context(String type) {
        switch (type) {
            case "discount":
                calculate = new DiscountProduct();
                break;
            case "reduction":
                calculate = new FullReductionProduct();
                break;
            default:
                calculate = new Product();
        }
    }

    public double calculate(int productQuantity, double price) {
        return calculate.calculate(productQuantity, price);
    }
}
