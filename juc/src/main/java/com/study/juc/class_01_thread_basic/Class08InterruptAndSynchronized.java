package com.study.juc.class_01_thread_basic;

import com.study.util.SleepHelper;

/**
 * @author test_jia
 * ClassName Class06InterruptAndSleep
 * PackageName com.study.juc.class_01_thread_basic
 * Description
 * <p> 线程设置 interrupt 以后，如果线程正在争抢锁，争抢锁的线程使用 interrupt 不会设置标志位
 * Date: 2022/5/13
 * Time: 下午8:30
 */
public class Class08InterruptAndSynchronized {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            synchronized (lock) {
                SleepHelper.secondsSleep(10);
            }
        });
        thread.start();
        SleepHelper.secondsSleep(1);
        Thread tmpThread = new Thread(() -> {
            synchronized (lock) {

            }
            System.out.println("tmp thread end!");
        });
        tmpThread.start();
        SleepHelper.secondsSleep(1);
        tmpThread.interrupt();
    }
}
