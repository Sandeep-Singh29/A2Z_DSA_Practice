package com.practice.multithreding.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Sandeep Singh
 * Date: 17/02/25
 */

public class UnFairLockExample {

    private final Lock unfair = new ReentrantLock();

    public void accessResource() {
        unfair.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " :  Acquire The Lock..!!");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(e.getLocalizedMessage());
        } finally {
            System.out.println(Thread.currentThread().getName() + " :  Released The Lock..!!");
            unfair.unlock();
        }
    }

    public static void main(String[] args) {
        UnFairLockExample unFairLockExample = new UnFairLockExample();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                unFairLockExample.accessResource();
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");
        t1.start();
        t2.start();
        t3.start();

    }
}
