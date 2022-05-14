package com.study.juc.class_03_visibility;

import com.study.util.SleepHelper;

/**
 * @author test_jia
 * ClassName Class01Volatile
 * PackageName com.study.juc.class_03_volatile
 * Description
 * <p> 线程可见性尝试
 * 以下代码按照理想情况线程启动后，打印 method start
 * 1秒之后打印 method end
 * 但是因为线程不可见性，线程启动后会将running值拷贝一份，放到自己线程缓存中，running 设为false时，更改的值不是线程本地缓存的值，
 * 更改的是主线程中的running的值，线程无法主动获取running变更后的值，所以不会停止
 * 解决方法，running 变量使用 volatile 修饰
 * volatile 的作用，保证线程可见性。
 * 简单说，就是线程启动后，每次执行while循环，都会去读取running的值，在主线程更改running的值后，线程能够获取到对应修改后的值。
 * <p>
 *     为什么在while语句中增加 输出语句，会停止？
 *     因为系统输出语句有 synchonized 修饰，会触发内存缓存同步刷新。
 * </p>
 * Date: 2022/5/14
 * Time: 上午11:53
 */
public class Class01Volatile {
    private static /*volatile*/ boolean running = true;

    public static void method() {
        System.out.println("method start!");
        while (running) {
            // do something
//            System.out.println("hello");
        }
        System.out.println("method end!");
    }

    public static void main(String[] args) {
        new Thread(Class01Volatile::method, "method_thread").start();
        SleepHelper.secondsSleep(1);
        running = false;
        System.out.println("running is false");
    }
}
