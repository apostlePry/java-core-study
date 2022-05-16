package com.study.juc.class_04_false_sharing;

import com.study.util.SleepHelper;

import java.util.concurrent.CountDownLatch;

/**
 * @author test_jia
 * ClassName Class01CacheLinePadding
 * PackageName com.study.juc.class_04_false_sharing
 * Description
 * <p> 缓存行读取
 * Date: 2022/5/14
 * Time: 下午12:23
 */
public class Class01CacheLinePadding {
    private static final long COUNT = 1_0000_0000;

    private static class CacheLine {
//        private long p1, p2, p3, p4, p5, p6, p7;
        public long x = 0;
//        private long p9, p10, p11, p12, p13, p14, p15;
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
