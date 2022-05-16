package com.study.juc.class_01_thread_basic;

import com.study.util.SleepHelper;

/**
 * @author test_jia
 * ClassName Class06InterruptAndSleep
 * PackageName com.study.juc.class_01_thread_basic
 * Description
 * <p> 线程设置 interrupt 以后，如果线程正在 wait，则会抛出 InterruptedException异常
 * Date: 2022/5/13
 * Time: 下午8:30
 */
public class Class07InterruptAndWait {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    System.out.println("Thread is interrupted!");
                    System.out.println(Thread.currentThread().isInterrupted());
                }
            }
        });
        thread.start();
        SleepHelper.secondsSleep(3);
        thread.interrupt();
    }
}
