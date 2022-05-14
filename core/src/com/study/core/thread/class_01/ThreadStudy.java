package com.study.core.thread.class_01;

/**
 * @author test_jia
 * ClassName ThreadStudy
 * PackageName com.study.core.thread.class_01
 * Description
 * <p>
 * Date: 2022/5/11
 * Time: 下午5:02
 */
public class ThreadStudy extends Thread {
    private int count;

    public void exec() {
        count++;
    }

    @Override
    public void run() {
        synchronized (this) {
            exec();
        }
    }

    public static void main(String[] args) {
        ThreadStudy threadStudy = new ThreadStudy();
        threadStudy.start();
    }
}
