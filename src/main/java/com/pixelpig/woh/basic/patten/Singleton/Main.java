package com.pixelpig.woh.basic.patten.Singleton;

/**
 * Create by pixelpig
 * 2019/8/25
 */
public class Main extends Thread{

    @Override
    public void run() {
        SingletonWithStaic singleton = SingletonWithStaic.getInstance();
        System.out.println(getName() + ": SingletonWithStaic obj = " + singleton);

        SingletonNotThreadSafe unSafesingleton = SingletonNotThreadSafe.getInstance();
        System.out.println(getName() + ": unSafesingleton obj = " + unSafesingleton);

        SingletonWithEnum singletonWithEnum = SingletonWithEnum.INSTANCE;

        System.out.println(getName() + ": singletonWithEnum obj = " + singletonWithEnum);
    }

    public static void main(String[] args) {
//        SingletonWithStaic singleton = SingletonWithStaic.getInstance();
//        SingletonWithStaic singleton1 = SingletonWithStaic.getInstance();
//        //this is abort for private constructor
////        SingletonWithStaic singleton2 = new SingletonWithStaic();
//
//        if (singleton == singleton1) {
//            System.out.println("Equal.");
//        } else {
//            System.out.println("Not equal.");
//        }

        //多线程环境创建单例
        new Main("A").start();
        new Main("B").start();
        new Main("C").start();
    }

    public Main(String name) {
        super(name);
    }


}
