package com.practice.multithreding.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Author: Sandeep Singh
 * Date: 17/02/25
 */

public class ReadWriteOperationUsingLock {

    private int count = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock readLock = lock.readLock();

    private final Lock writeLock = lock.writeLock();


    public void increment() {
        writeLock.lock();
        System.out.print(Thread.currentThread().getName() + " :  Locked ::  ");
        try {
            count++;
        } finally {
            writeLock.unlock();
            System.out.print(Thread.currentThread().getName() + " :  UnLocked :: Process -- ");
        }
    }

    public int getCount() {
        readLock.lock();
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }


    public static void main(String[] args) throws InterruptedException {

        ReadWriteOperationUsingLock counter = new ReadWriteOperationUsingLock();
        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " : Read : " + counter.getCount());
                }
            }
        };

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    counter.increment();
                    System.out.println(Thread.currentThread().getName() + " : Increment : ");
                }
            }
        };

        Thread writeThread = new Thread(writeTask, "Write-Thread");
        Thread readThread1 = new Thread(readTask, "Read-Thread");
        Thread readThread2 = new Thread(readTask, "Read-Thread");
        writeThread.start();
        readThread1.start();
        readThread2.start();

        writeThread.join();
        readThread1.join();
        readThread2.join();

        System.out.println("Final Count : " + counter.getCount());

        // I have implement a thread using runnable using Lambda and pass the Thread Name.
       /*
        Thread lambdaThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Using Lambda : " + i);
            }
        }, "Lambda-Thread");
        lambdaThread.start();
        */

    }
}
