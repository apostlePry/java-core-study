package com.study.juc.class_01_thread_basic;

import com.study.util.SleepHelper;

/**
 * @author test_jia
 * ClassName Class04Interrupt
 * PackageName com.study.juc.class_01_thread_basic
 * Description
 * <p> 线程设置标志位，允许被打断
 * Date: 2022/5/13
 * Time: 下午8:16
 */
public class Class04Interrupt {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread is interrupted!");
                    System.out.println(Thread.currentThread().isInterrupted());
                    break;
                }
                System.out.println("Thread is not interrupted!");
            }
        });
        long start = System.currentTimeMillis();
        thread.start();
        SleepHelper.secondsSleep(2);
        long end = System.currentTimeMillis();
        while (end - start < 3000) {
            end = System.currentTimeMillis();
        }
        thread.interrupt();
    }
}
