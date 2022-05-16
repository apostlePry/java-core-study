package com.study.juc.class_01_thread_basic;

import com.study.util.SleepHelper;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author test_jia
 * ClassName Class06InterruptAndSleep
 * PackageName com.study.juc.class_01_thread_basic
 * Description
 * <p> 如果线程被lock锁住，另一个争抢锁的线程使用 lockInterrupt 会设置标志位
 * Date: 2022/5/13
 * Time: 下午8:30
 */
public class Class10InterruptAndLockInterrupt {
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            lock.lock();
            try {
                SleepHelper.secondsSleep(10);
            } finally {
                lock.unlock();
            }
            System.out.println("thread end!");
        });
        thread.start();
        SleepHelper.secondsSleep(1);
        Thread tmpThread = new Thread(() -> {
            try {
                lock.lockInterruptibly();
            } catch (InterruptedException e) {
                System.out.println("tmp thread end!");
            } finally {
                lock.unlock();
            }
        });
        tmpThread.start();
        SleepHelper.secondsSleep(1);
        tmpThread.interrupt();
    }
}
