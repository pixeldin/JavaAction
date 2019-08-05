package com.pixelpig.woh.basic.lock;

/**
 * Create by wangxiangyu
 * 2019/3/7
 */
public class MyLock {
    private static int a ;

    public static void main(String[] args) {
        a = 1;
        Thread t = new Thread(() -> System.out.println("a = " + a));
        t.start();

        System.out.println("Main thread, a=" + a);
    }
}
