package com.study.juc.class_04_false_sharing;

import sun.misc.Contended;

import java.util.concurrent.CountDownLatch;

/**
 * @author test_jia
 * ClassName Class01CacheLinePadding
 * PackageName com.study.juc.class_04_false_sharing
 * Description
 * <p> jdk 1.8 使用注解 Contended 可以保证数据在单独缓存行
 * 注意：运行这个小程序的时候，需要加参数：-XX:-RestrictContended
 * Date: 2022/5/14
 * Time: 下午12:23
 */
public class Class02Contended {
    private static final long COUNT = 1_0000_0000;

    private static class CacheLine {
        @Contended  // 只在 jdk 1.8 中有效
        public long x = 0;
    }

    public static CacheLine[] arr = new CacheLine[2];
    static {
        arr[0] = new CacheLine();
        arr[1] = new CacheLine();
    }

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(arr.length);
        Thread t1 = new Thread(() -> {
            for (long i = 0; i < COUNT; i++) {
                arr[0].x = i;
            }
            latch.countDown();
        }, "t1");
        Thread t2 = new Thread(() -> {
            for (long i = 0; i < COUNT; i++) {
                arr[1].x = i;
            }
            latch.countDown();
        });
        final long start = System.currentTimeMillis();
        t1.start();
        t2.start();
        latch.await();
        System.out.println(System.currentTimeMillis() - start);
    }
}
