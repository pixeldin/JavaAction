package com.pixelpig.woh.basic.patten.Singleton;

/**
 * Create by pixelpig
 * 2019/8/25
 */
public class SingletonWithStaic {

    //声明为static保证该实例只有一个, 是属于类本身
    private static SingletonWithStaic singleton = new SingletonWithStaic();

    //private 表示无法从外部调用
    private SingletonWithStaic() {
        System.out.println("Generate a new instance.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static SingletonWithStaic getInstance() {
        return singleton;
    }



}
