package com.study.juc.class_02_thread_end;

import com.study.util.SleepHelper;

/**
 * @author test_jia
 * ClassName Class01Stop
 * PackageName com.study.juc.class_02_thread_end
 * Description
 * <p> 线程停止 1. 使用stop方法停止
 * 不建议使用，本质上不安全，可能会出现数据不一致
 * Date: 2022/5/13
 * Time: 下午11:44
 */
public class Class01Stop {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (true) {
                System.out.println("let's go!");
                SleepHelper.secondsSleep(1);
            }
        });
        thread.start();

        SleepHelper.secondsSleep(3);
        thread.stop();
    }
}
