package com.go.interview.thread.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQueue2<E> {
    private Queue<E> queue;
    private int baseMax = 16;
    private Lock reentRant = new ReentrantLock(true);
    private Condition full = reentRant.newCondition();
    private Condition empty = reentRant.newCondition();

    BlockingQueue2(int size) {
        queue = new LinkedList<>();
        this.baseMax = size;
    }

    public void put(E item) throws InterruptedException {
        reentRant.lock();
        if (baseMax == queue.size())
            full.await();
        try {
            queue.add(item);
            empty.signalAll();
        } finally {
            reentRant.unlock();
        }
    }

    public E take() throws InterruptedException {
        try {
            while (queue.size() == 0)
             empty.await();
            reentRant.lock();
            E item = queue.remove();
            full.signalAll();
            return item;
        } finally {
            reentRant.unlock();
        }
    }
}
