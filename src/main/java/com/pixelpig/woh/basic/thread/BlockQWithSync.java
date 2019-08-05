package com.pixelpig.woh.basic.thread;

import java.util.PriorityQueue;

/**
 * Create by pixelpig
 * 2019/5/19
 * <p>
 * Producer & Consumer with normal queue, consider thread safe.
 */
public class BlockQWithSync {
    int queueSize = 10;

    private PriorityQueue<Integer> queue = new PriorityQueue<>(queueSize);

    public static void main(String[] args) {
        BlockQWithSync blockQWithSync = new BlockQWithSync();
        Producer producer = blockQWithSync.new Producer();
        Consumer consumer = blockQWithSync.new Consumer();

        producer.start();
        consumer.start();

    }

    class Consumer extends Thread {
        @Override
        public void run() {
            consume();
        }

        private void consume() {
            while (true) {
                synchronized (queue) {
                    while (queue.size() == 0) {
                        try {
                            System.out.println("Waiting for queue to input.");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            queue.notify();
                        }
                    }
                    queue.poll();
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    queue.notify();
                    System.out.println("Get from queue, left size:" + queue.size());
                }
            }
        }
    }

    class Producer extends Thread {
        @Override
        public void run() {
           produce();
        }

        private void produce() {
            while (true) {
                synchronized (queue) {
                    while (queue.size() == queueSize) {
                        try {
                            System.out.println("Full of queue, wait for consumer...");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            queue.notify();
                        }
                    }
                    queue.offer(1);
                    queue.notify();
                    System.out.println("Produce into queue, left size:" + queue.size());
                }
            }
        }
    }


}
