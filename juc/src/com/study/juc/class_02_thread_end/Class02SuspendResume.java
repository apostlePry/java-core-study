package com.study.juc.class_02_thread_end;

import com.study.util.SleepHelper;

/**
 * @author test_jia
 * ClassName Class01Stop
 * PackageName com.study.juc.class_02_thread_end
 * Description
 * <p> 线程停止 2. 使用suspend方法暂停，然后使用resume恢复执行
 * 不建议使用，suspend 方法暂停的时候不会释放锁，很可能会造成死锁
 * Date: 2022/5/13
 * Time: 下午11:44
 */
public class Class02SuspendResume {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (true) {
                System.out.println("let's go!");
                SleepHelper.secondsSleep(1);
            }
        });
        thread.start();

        SleepHelper.secondsSleep(3);
        thread.suspend();
        SleepHelper.secondsSleep(5);
        thread.resume();
    }
}
