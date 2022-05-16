package com.study.juc.class_01_thread_basic;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * @author test_jia
 * ClassName Class01MultiVSSingleSwitch
 * PackageName com.study.juc.class_01
 * Description
 * <p> 多线程切换
 * 计算一亿个数的总和，并获取时间，使用不同线程数量计算
 * Date: 2022/5/13
 * Time: 上午1:20
 */
public class Class01MultiVSSingleSwitch {
    static int numCount = 100000000;
    private static double[] nums = new double[numCount];
    private static Random random = new Random();
    private static DecimalFormat df = new DecimalFormat("0.00");


    static {
        for (int index = 0; index < numCount; index++) {
            nums[index] = random.nextDouble();
        }
    }

    /**
     * 单线程执行
     */
    public static void m1() {
        double result = 0;
        long start = System.currentTimeMillis();
        for (double num : nums) {
            result += num;
        }
        long end = System.currentTimeMillis();
        System.out.println("m1: " + (end - start) + " result = " + df.format(result));
    }

    /**
     * 两个线程执行
     */
    static double result1 = 0, result2 = 0;
    public static void m2() throws InterruptedException {
        int tmp = numCount >> 1;

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < tmp; i++) {
                result1 += nums[i];
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = tmp; i < numCount; i++) {
                result2 += nums[i];
            }
        });
        long start = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        double result = result1 + result2;
        long end = System.currentTimeMillis();
        System.out.println("m2: " + (end - start) + " result = " + df.format(result));
    }

    /**
     * 自定义线程数量执行
     */
    public static void m3() throws InterruptedException {
        int threadCount = 8;
        Thread[] threads = new Thread[threadCount];
        double[] results = new double[threadCount];
        int segmentCount = numCount / threadCount;
        CountDownLatch latch = new CountDownLatch(threadCount);
        for (int index = 0; index < threadCount; index++) {
            int m = index;
            threads[index] = new Thread(() -> {
                for (int i = m * segmentCount; i < (m + 1) * segmentCount && i < numCount; i++) {
                    results[m] += nums[i];
                }
                latch.countDown();
            });
        }
        long start = System.currentTimeMillis();
        for (Thread thread : threads) {
            thread.start();
        }
        latch.await();
        double result = 0;
        for (double v : results) {
            result += v;
        }
        long end = System.currentTimeMillis();
        System.out.println("m3: " + (end - start) + " result = " + df.format(result));
    }

    public static void main(String[] args) throws InterruptedException {
        m1();
        m2();
        m3();
    }
}
