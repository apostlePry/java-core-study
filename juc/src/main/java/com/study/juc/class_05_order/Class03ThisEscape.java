package com.study.juc.class_05_order;

import java.io.IOException;

/**
 * @author test_jia
 * ClassName Class03ThisEscape
 * PackageName com.study.juc.class_05_order
 * Description
 * <p> this 对象溢出
 * Date: 2022/5/14
 * Time: 下午2:55
 */
public class Class03ThisEscape {
    private static int num = 8;

    public Class03ThisEscape() {
        new Thread(() -> System.out.println(this.num)).start();
    }

    public static void main(String[] args) throws IOException {
        Class03ThisEscape thisEscape = new Class03ThisEscape();
        System.in.read();
    }
}
