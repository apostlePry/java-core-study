package com.study.juc.class_01_thread_basic;

import java.util.concurrent.*;

/**
 * @author test_jia
 * ClassName Class02HowToCreateThread
 * PackageName com.study.juc.class_01_thread_basic
 * Description
 * <p> 怎么创建启动线程?
 * Date: 2022/5/13
 * Time: 下午2:41
 */
public class Class02HowToCreateThread {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 方式一 实例化实现Runnable接口的类
        new Thread(new MyRunnable()).start();
        // 方式二 实例化继承Thread类的子类
        new MyThread().start();
        // 方式三 通过匿名类实现
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start by anonymous implements runnable");
            }
        }).start();
        // 方式四 通过线程池方式
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            System.out.println("start by thread pool and lambda");
        });
        // 方式五 通过lambda实现
        new Thread(() -> {
            System.out.println("start by lambda");
        }).start();

        // 方式六 通过实现callable
        Future<String> submit = executorService.submit(new MyCall());
        String result = submit.get();
        System.out.println(result);
        executorService.shutdown();
        FutureTask<String> task = new FutureTask<>(new MyCall());
        new Thread(task).start();
        System.out.println(task.get());
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("start by implements runnable!");
        }
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("start by extends thread!");
        }
    }

    static class MyCall implements Callable<String> {
        @Override
        public String call() throws Exception {
            return "start by implements callable";
        }
    }
}
