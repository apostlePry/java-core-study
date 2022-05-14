package com.study.juc.class_05_order;

/**
 * @author test_jia
 * ClassName Class02NoVisibility
 * PackageName com.study.juc.class_05_order
 * Description
 * <p> 线程不可见
 * Date: 2022/5/14
 * Time: 下午2:46
 */
public class Class02NoVisibility {
    private static boolean ready = false;
    private static int num = 0;

    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.println(num);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new ReaderThread();
        thread.start();
        num = 42;
        ready = true;
        thread.join();
    }
}
