package com.desgin.study_02_strategy.class02;

/**
 * @author test_jia
 * ClassName Product
 * PackageName com.desgin.study_02_strategy.class02
 * Description 普通商品类，计算方式没有变化
 * <p>
 * Date: 2022/4/27
 * Time: 上午12:14
 */
public class Product extends Calculate {
    @Override
    public double calculate(int productQuantity, double price) {
        if (productQuantity == 0 || price == 0)
            return 0;
        this.total = price * productQuantity;
        return this.total;
    }
}
