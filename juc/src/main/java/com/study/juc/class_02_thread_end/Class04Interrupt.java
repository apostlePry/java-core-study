package com.study.juc.class_02_thread_end;

import com.study.util.SleepHelper;

/**
 * @author test_jia
 * ClassName Class01Stop
 * PackageName com.study.juc.class_02_thread_end
 * Description
 * <p> 线程停止 3. 使用interrupted 标志位结束线程
 * 比较优雅的结束方式，但是不能精准控制结束时间。
 * 第一次循环次数 1569559900
 * 第二次循环次数 1477160566
 * Date: 2022/5/13
 * Time: 下午11:44
 */
public class Class04Interrupt {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            long index = 0;
            while (!Thread.interrupted()) {
                index++;
            }
            System.out.println(index);
        });
        thread.start();
        SleepHelper.secondsSleep(1);
        thread.interrupt();
    }
}
