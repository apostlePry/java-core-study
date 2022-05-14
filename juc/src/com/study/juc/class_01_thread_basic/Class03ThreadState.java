package com.study.juc.class_01_thread_basic;

import com.study.util.SleepHelper;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author test_jia
 * ClassName Class03ThreadState
 * PackageName com.study.juc.class_01_thread_basic
 * Description
 * <p> 获取线程状态
 * Date: 2022/5/13
 * Time: 下午3:03
 */
public class Class03ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("2: " + Thread.currentThread().getState());
            for (int i = 0; i < 3; i++) {
                SleepHelper.secondsSleep(1);
                System.out.print(i + " ");
            }
            System.out.println();
        });
        System.out.println("1: " + t1.getState());
        t1.start();
        t1.join();
        System.out.println("3: " + t1.getState());

        // ====================== WAITING ======================
        Thread t2 = new Thread(() -> {
            LockSupport.park();
            System.out.println("t2 go on!");
            SleepHelper.secondsSleep(5);
        });
        t2.start();
        SleepHelper.secondsSleep(1);
        System.out.println("4: " + t2.getState());
        LockSupport.unpark(t2);
        SleepHelper.secondsSleep(1);
        System.out.println("5: " + t2.getState());

        // ====================== BLOCKED ======================
        final Object lockObject = new Object();
        Thread t3 = new Thread(() -> {
            synchronized (lockObject) {
                System.out.println("t3 go on");
            }
        });
        new Thread(() -> {
            synchronized (lockObject) {
                SleepHelper.secondsSleep(5);
            }
        }).start();
        SleepHelper.secondsSleep(1);
        t3.start();
        SleepHelper.secondsSleep(1);
        System.out.println("6: " + t3.getState());

        // ====================== WAITING ======================
        final Lock lock = new ReentrantLock();
        Thread t4 = new Thread(() -> {
            lock.lock();
            System.out.println("t4 go on");
            lock.unlock();
        });
        new Thread(() -> {
            lock.lock();
            SleepHelper.secondsSleep(5);
            lock.unlock();
        }).start();
        SleepHelper.secondsSleep(1);
        t4.start();
        SleepHelper.secondsSleep(1);
        System.out.println("7: " + t4.getState());

        // ====================== WAITING ======================
        Thread t5 = new Thread(() -> LockSupport.park());
        t5.start();
        SleepHelper.secondsSleep(1);
        System.out.println("8: " + t5.getState());
        LockSupport.unpark(t5);

        // ====================== READY ======================
        Thread t6 = new Thread(() -> {
            System.out.println("9: " + Thread.currentThread().getState());
            for (int index = 0; index < 3; index++) {
                SleepHelper.secondsSleep(1);
                System.out.print(index + " ");
            }
            System.out.println();
            Thread.yield();
            SleepHelper.secondsSleep(5);
        });
        Thread t7 = new Thread(() -> {
            System.out.println("10: " + t6.getState());
            System.out.println("t7 go on");
        });
        t6.start();
        t7.start();
    }
}
