package com.study.util;

import java.util.concurrent.TimeUnit;

/**
 * @author test_jia
 * ClassName SleepHelper
 * PackageName com.study.util
 * Description
 * <p>
 * Date: 2022/5/13
 * Time: 下午3:04
 */
public class SleepHelper {

    public static void secondsSleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " is interrupted!");
        }
    }
}
