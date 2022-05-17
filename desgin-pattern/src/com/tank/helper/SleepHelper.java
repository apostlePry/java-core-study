package com.tank.helper;

import java.util.concurrent.TimeUnit;

/**
 * @author test_jia
 * ClassName SleepHelper
 * PackageName com.tank.helper
 * Description
 * <p>
 * Date: 2022/5/17
 * Time: 下午4:05
 */
public class SleepHelper {

    public static void sleep(int timeout, String unit) {
        switch (unit) {
            case "second":
                secondSleep(timeout);
                break;
            case "milli":
                milliSleep(timeout);
                break;
            default:
                System.out.println("错误的类型");
        }
    }

    public static void secondSleep(int timeout) {
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void milliSleep(int timeout) {
        try {
            TimeUnit.MILLISECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
