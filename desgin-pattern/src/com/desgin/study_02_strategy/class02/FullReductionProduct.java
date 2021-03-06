package com.desgin.study_02_strategy.class02;

/**
 * @author test_jia
 * ClassName FullReductionProduct
 * PackageName com.desgin.study_02_strategy.class02
 * Description
 * <p> 满减商品，满300 减 100，可以叠加
 * Date: 2022/4/27
 * Time: 上午12:18
 */
public class FullReductionProduct extends Calculate {
    private int fullReductionPrice = 300;
    private int reductionPrice = 100;

    @Override
    public double calculate(int productQuantity, double price) {
        if (productQuantity == 0 || price == 0)
            return 0;
        this.total = productQuantity * price;
        int tmp = (int) (this.total / fullReductionPrice);
        double tmpPrice = tmp * reductionPrice;
        this.total = this.total - tmpPrice;
        return this.total;
    }
}
