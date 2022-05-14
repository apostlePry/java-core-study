package com.study.juc.class_06_sync_basic;

import com.study.util.SleepHelper;

/**
 * @author test_jia
 * ClassName Class02WhatIsLock
 * PackageName com.study.juc.class_06_sync_basic
 * Description
 * <p> 上锁的本质，，就是将并发线程更改为序列化编程
 * Date: 2022/5/14
 * Time: 下午10:40
 */
public class Class02WhatIsLock {
    private static Object lock = new Object();

    public static void main(String[] args) {
        Runnable runnable = () -> {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " start!");
                SleepHelper.secondsSleep(2);
                System.out.println(Thread.currentThread().getName() + " end!");
            }
        };
        for (int index = 0; index < 3; index++) {
            new Thread(runnable).start();
        }
    }
}
