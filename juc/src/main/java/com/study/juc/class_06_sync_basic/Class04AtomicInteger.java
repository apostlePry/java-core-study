package com.study.juc.class_06_sync_basic;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author test_jia
 * ClassName Class04AtomicInteger
 * PackageName com.study.juc.class_06_sync_basic
 * Description
 * <p> 使用 AtomicXXX 原子类实现原子操作
 * Date: 2022/5/14
 * Time: 下午11:15
 */
public class Class04AtomicInteger {
    private static AtomicLong num = new AtomicLong(0);

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[100];
        CountDownLatch latch = new CountDownLatch(threads.length);
        for (int index = 0; index < threads.length; index++) {
            threads[index] = new Thread(() -> {
                for (int i = 0; i < 10000; i++) {
                    num.incrementAndGet();
                }
                latch.countDown();
            });
        }
        for (Thread thread : threads) {
            thread.start();
        }
        latch.await();
        System.out.println(num);
    }
}
