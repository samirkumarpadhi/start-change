package com.go.interview.thread.queue;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue {
    public static void main(String[] args) {
        java.util.concurrent.BlockingQueue<Integer> blockQueue = new ArrayBlockingQueue<>(10);
        Runnable producer = () -> {
            while(true) {
                blockQueue.put(Math.random());
            }
        };
        new Thread(producer).start();
        new Thread(producer).start();

        Runnable consumer = () -> {
            while(true) {
                blockQueue.take();
            }
        }
        new Thread(consumer).start();
        new Thread(consumer).start();
        Thread.sleep(1000);

    }
}
