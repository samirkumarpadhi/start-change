package com.go.interview.thread.queue;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue {
    public static void main(String[] args) {
        java.util.concurrent.BlockingQueue<Double> blockQueue = new ArrayBlockingQueue<>(10);
        Runnable producer = () -> {
            while(true) {
                try {
                    blockQueue.put(Math.random());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(producer).start();
        new Thread(producer).start();

        Runnable consumer = () -> {
            while(true) {
                try {
                    blockQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(consumer).start();
        new Thread(consumer).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
