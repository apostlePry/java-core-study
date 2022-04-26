package com.desgin.study_02_strategy.class01;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author test_jia
 * ClassName Client
 * PackageName com.desgin.study_02_strategy.class01
 * Description 完成收银员的计算工作，根据商品价格，数量计算总价
 * <p>
 *     缺点，不够灵活，如果计算方式发生变化，比如打折，或者满减，这种计算方式就不适合了
 * Date: 2022/4/26
 * Time: 下午11:54
 */
public class Client {

    public static void main(String[] args) {
        Product product = new Product();
        Random random = new Random();
        int quantity = random.nextInt(15);
        double price = random.nextDouble() * 100;
        BigDecimal bigDecimal = new BigDecimal(price);
        price = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println("商品数量: " + quantity + ", 商品价格: " + price);
        double totalPrice = product.calculate(quantity, price);
        System.out.println(totalPrice);
    }
}
