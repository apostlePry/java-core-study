package com.desgin.study_02_strategy.class02;

/**
 * @author test_jia
 * ClassName ProductFactory
 * PackageName com.desgin.study_02_strategy.class02
 * Description
 * <p>
 * Date: 2022/4/27
 * Time: 上午12:21
 */
public class ProductFactory {

    public static Calculate createProduct(String type) {
        Calculate calculate = null;
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
        return calculate;
    }
}
