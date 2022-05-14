package com.study.core.thread.class_02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author test_jia
 * ClassName ThreadPoolDemo
 * PackageName com.study.core.thread.class_02
 * Description
 * <p>
 * Date: 2022/5/12
 * Time: 下午11:06
 */
public class ThreadPoolDemo {
    /**
     * 生产者消费这模型，如何控制？
     * 假设仓库只能放10个商品，如果仓库满了，count = 10， 那么需要停止生产
     * 如果仓库没有商品，count = 0，那么需要停止消费。
     */
    static int count = 0;

    static class Producer implements Runnable {
        private synchronized void producer() {
            try {
                if (count == 0) {
                    this.notifyAll();
                }
                while (count  < 10) {
                    count++;
                    System.out.println(Thread.currentThread().getName() + " ---> " + count);
                    if (count == 10) {
                        this.wait();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            producer();
        }
    }

    static class Consumer implements Runnable {
        private synchronized void consumer() {
            try {
                if (count == 10) {
                    this.notifyAll();
                }
                while (count > 0) {
                    count--;
                    System.out.println(Thread.currentThread().getName() + " ---> " + count);
                    if (count == 0) {
                        this.wait();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            consumer();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Thread producerThread = new Thread(new Producer(), "producer");
        Thread consumerThread = new Thread(new Consumer(), "consumer");
        producerThread.start();
        consumerThread.start();
    }
}
