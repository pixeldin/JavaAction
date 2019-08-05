package com.pixelpig.woh.basic.thread;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Create by pixelpig
 * 2019/5/19
 * BlockingQueue implemented in jdk, lock for thread safety inside
 */
public class BlockQueueImpl {
    private int queueSize = 1;
    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(queueSize);

    public static void main(String[] args) {
        BlockQueueImpl blockimp = new BlockQueueImpl();
        Consumer consumer = blockimp.new Consumer();
        Producer producer = blockimp.new Producer();

        consumer.start();
        producer.start();
    }

    class Consumer extends Thread {
        @Override
        public void run() {
            //consumer with blocking queue
            consume();
        }

        private void consume() {
            int time = 0;
            while (true) {
                try {
                    queue.take();
                    System.out.println("Get from queue, left size: " + queue.size());
                    time++;
                    System.out.println("### For now, consume time:" + time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class Producer extends Thread {
        @Override
        public void run() {
            //produce into queue, block when queue size full
            produce();
        }

        private void produce() {
            int time = 0;
            while (true) {
                try {
                    queue.put(1);
                    time++;
                    System.out.println("Produce into queue, queue size:" + queue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("==== For now, produce time:" + time);
                if (time >= 10) {
                    break;
                }
            }
        }
    }

}
