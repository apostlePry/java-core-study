package com.study.juc.class_06_sync_basic;

import com.study.util.SleepHelper;

/**
 * @author test_jia
 * ClassName Class03SinglLockVSMultiLock
 * PackageName com.study.juc.class_06_sync_basic
 * Description
 * <p>
 * Date: 2022/5/14
 * Time: 下午10:44
 */
public class Class03SingleLockVSMultiLock {
    private static Object o1 = new Object();
    private static Object o2 = new Object();
    private static Object o3 = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + " start!");
                SleepHelper.secondsSleep(2);
                System.out.println(Thread.currentThread().getName() + " end!");
            }
        }).start();
        new Thread(() -> {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + " start!");
                SleepHelper.secondsSleep(2);
                System.out.println(Thread.currentThread().getName() + " end!");
            }
        }).start();
        new Thread(() -> {
            synchronized (o3) {
                System.out.println(Thread.currentThread().getName() + " start!");
                SleepHelper.secondsSleep(2);
                System.out.println(Thread.currentThread().getName() + " end!");
            }
        }).start();
    }
}
