package com.desgin.study_02_strategy.class03;

/**
 * @author test_jia
 * ClassName DiscountProduct
 * PackageName com.desgin.study_02_strategy.class02
 * Description
 * <p> 打折商品类，商品总价打8折
 * Date: 2022/4/27
 * Time: 上午12:15
 */
public class DiscountProduct extends Calculate {
    private double discount = 0.8;

    @Override
    public double calculate(int productQuantity, double price) {
        if (productQuantity == 0 || price == 0)
            return 0;
        this.total = productQuantity * price;
        this.total *= discount;
        return this.total;
    }
}
