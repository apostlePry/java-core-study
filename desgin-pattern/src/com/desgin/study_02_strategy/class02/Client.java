package com.desgin.study_02_strategy.class02;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author test_jia
 * ClassName Client
 * PackageName com.desgin.study_02_strategy.class02
 * Description
 * <p> 使用简单factory还需要维护两个对象
 * Date: 2022/4/27
 * Time: 上午12:23
 */
public class Client {

    public static void main(String[] args) {
        Random random = new Random();
        int quantity = random.nextInt(15);
        double price = random.nextDouble() * 100;
        BigDecimal bigDecimal = new BigDecimal(price);
        price = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println("商品数量: " + quantity + ", 商品价格: " + price);
        String[] types = {"", "discount", "reduction", "hello"};
        String type = types[random.nextInt(types.length)];
        Calculate product = ProductFactory.createProduct(type);
        double total = product.calculate(quantity, price);
        System.out.println("总价计算类型是: " + type + ", 总价是: " + total);
    }
}
