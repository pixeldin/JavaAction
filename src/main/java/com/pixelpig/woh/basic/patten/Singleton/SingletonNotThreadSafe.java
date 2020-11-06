package com.pixelpig.woh.basic.patten.Singleton;

/**
 * Create by pixelpig
 * 2019/8/25
 */
public class SingletonNotThreadSafe {

    private static SingletonNotThreadSafe singletonNotThreadSafe = null;
    private SingletonNotThreadSafe() {
        //do nothing, just abort init outside
        //cost some time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static SingletonNotThreadSafe getInstance() {
        if (singletonNotThreadSafe == null) {
            singletonNotThreadSafe =  new SingletonNotThreadSafe();
        }
        return singletonNotThreadSafe;
    }


}
