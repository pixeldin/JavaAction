package com.pixelpig.woh.basic.thread.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Create by pixelpig
 * 2019/5/18
 */
public class demo {
    public static void main(String[] args) {
//        ThreadPoolExecutor executor = new ThreadPoolExecutor()
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

        for (int i = 0; i < 200; i++) {
            int finalI = i;
                executor.execute(() -> {
                    try {
                        //try to delay task
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Do something of " + finalI + "...");
                    System.out.println("Queue size of executor: "
                            + executor.getQueue().size());
                });
        }
        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Main thread done.");
    }
}
