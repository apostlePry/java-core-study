package com.desgin.study_02_strategy.class01;

/**
 * @author test_jia
 * ClassName Product
 * PackageName com.desgin.study_02_strategy.class01
 * Description
 * <p>
 * Date: 2022/4/26
 * Time: 下午11:55
 */
public class Product {
    // 总价
    private double total;

    /**
     * 根据商品数量和价格计算总价
     * @param productNum 商品数量
     * @param price 商品价格
     * @return 返回总价
     */
    public double calculate(int productNum, double price) {
        if (price == 0 || productNum == 0) {
            return 0;
        }
        this.total = productNum * price;
        return this.total;
    }
}
