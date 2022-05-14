package com.study.juc.class_05_order;

import java.util.concurrent.CountDownLatch;

/**
 * @author test_jia
 * ClassName Class01DisOrder
 * PackageName com.study.juc.class_05_order
 * Description
 * <p> 程序未按照顺序执行
 * Date: 2022/5/14
 * Time: 下午2:30
 */
public class Class01DisOrder {
    private static int x = 0, y = 0;
    private static int a = 0, b = 0;

    public static void main(String[] args) throws InterruptedException {
        for (long index = 0; index < Long.MAX_VALUE; index++) {
            a = 0;
            b = 0;
            x = 0;
            y = 0;
            CountDownLatch latch = new CountDownLatch(2);
            Thread t1 = new Thread(() -> {
                a = 1;
                x = b;
                latch.countDown();
            });
            Thread t2 = new Thread(() -> {
                b = 1;
                y = a;
                latch.countDown();
            });
            t1.start();
            t2.start();
            latch.await();
            if (x == 0 && y == 0) {
                System.out.println("第" + index + "次执行顺讯错乱，x = " + x + ", y = " + y);
                break;
            }
        }
    }
}
