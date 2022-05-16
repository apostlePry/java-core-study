package com.study.juc.class_01_thread_basic;

import com.study.util.SleepHelper;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author test_jia
 * ClassName Class06InterruptAndSleep
 * PackageName com.study.juc.class_01_thread_basic
 * Description
 * <p> 如果线程被lock锁住，另一个争抢锁的线程使用 interrupt 不会设置标志位
 * Date: 2022/5/13
 * Time: 下午8:30
 */
public class Class09InterruptAndLock {
    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            lock.lock();
            SleepHelper.secondsSleep(10);
            lock.unlock();
            System.out.println("thread end!");
        });
        thread.start();
        SleepHelper.secondsSleep(1);
        Thread tmpThread = new Thread(() -> {
            lock.lock();
            lock.unlock();
            System.out.println("tmp thread end!");
        });
        tmpThread.start();
        SleepHelper.secondsSleep(1);
        tmpThread.interrupt();
    }
}
