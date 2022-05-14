package com.study.juc.class_06_sync_basic;

import java.util.concurrent.CountDownLatch;

/**
 * @author test_jia
 * ClassName Class01IPlusPlus
 * PackageName com.study.juc.class_06_sync_basic
 * Description
 * <p> 数据不一致问题
 * 如下代码，，100个线程，对数字n执行自增操作，每个线程自增10000次，最后的结果会是什么样的
 * Date: 2022/5/14
 * Time: 下午10:25
 */
public class Class01IPlusPlus {
    private static long num = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[100];
        CountDownLatch latch = new CountDownLatch(threads.length);
        for (int index = 0; index < threads.length; index++) {
            threads[index] = new Thread(() -> {
                for (int i = 0; i < 10000; i++) {
                    synchronized (Class01IPlusPlus.class) {
                        num++;
                    }
                }
                latch.countDown();
            });
        }
        for (Thread thread : threads) {
            thread.start();
        }
        latch.await();
        // 如果不使用synchronized 加锁，期望结果 1000000，实际结果远远达不到 1000000，是因为线程竞争，导致数据不一致
        System.out.println(num);
    }
}
