package com.study.juc.class_06_sync_basic;

/**
 * @author test_jia
 * ClassName Test
 * PackageName com.study.juc.class_06_sync_basic
 * Description
 * <p>
 * Date: 2022/5/14
 * Time: 下午10:36
 */
public class Test {
    private static int n = 0;

    public static void main(String[] args) {
        synchronized (Test.class) {
            n++;
        }
    }
}
