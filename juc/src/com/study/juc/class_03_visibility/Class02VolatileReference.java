package com.study.juc.class_03_visibility;

import com.study.util.SleepHelper;

/**
 * @author test_jia
 * ClassName Class02VolatileReference
 * PackageName com.study.juc.class_03_volatile
 * Description
 * <p> volatile 修饰引用类型，引用类型中的属性值更改会有线程可见性问题，除非属性也被volatile修饰
 * Date: 2022/5/14
 * Time: 下午12:10
 */
public class Class02VolatileReference {

    private static class VolatileReference {
        /*volatile*/ boolean running = true;
        void method() {
            System.out.println("volatile reference method start!");
            while (running){}
            System.out.println("volatile reference method end!");
        }
    }

    private static volatile VolatileReference reference = new VolatileReference();
    public static void main(String[] args) {
        new Thread(reference::method, "volatile reference").start();
        SleepHelper.secondsSleep(1);
        reference.running = false;
        System.out.println("volatile reference running is false");
    }
}
