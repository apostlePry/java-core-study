package com.desgin.study_02_strategy.class03;

/**
 * @author test_jia
 * ClassName Calculate
 * PackageName com.desgin.study_02_strategy.class02
 * Description 抽象计算类，定义计算方法
 * <p>
 * Date: 2022/4/27
 * Time: 上午12:11
 */
public abstract class Calculate {
    protected double total;
    /**
     * 根据商品数量和商品价格计算总价
     * @param productQuantity 商品数量
     * @return
     */
    public abstract double calculate(int productQuantity, double price);
}
