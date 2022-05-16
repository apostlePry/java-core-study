package com.study.juc.class_06_sync_basic;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author test_jia
 * ClassName Class05HelloJOL
 * PackageName com.study.juc.class_06_sync_basic
 * Description
 * <p> jol 分析内存布局
 * Date: 2022/5/15
 * Time: 上午1:11
 */
public class Class05HelloJOL {
    public static void main(String[] args) {
        // 睡眠五秒后创建对象,会启动偏向锁
//        SleepHelper.secondsSleep(5);

        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());

        synchronized (Class05HelloJOL.class) {
            System.out.println(o);
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
    }
}
