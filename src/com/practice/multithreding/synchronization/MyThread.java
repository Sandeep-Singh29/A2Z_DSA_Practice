package com.practice.multithreding.synchronization;

/**
 * Author: Sandeep Singh
 * Date: 16/02/25
 */

public class MyThread extends Thread {

    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
