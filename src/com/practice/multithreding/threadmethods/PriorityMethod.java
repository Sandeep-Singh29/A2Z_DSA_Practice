package com.practice.multithreding.threadmethods;

/**
 * Author: Sandeep Singh
 * Date: 14/02/25
 */

/*
getPriority()



*/

public class PriorityMethod extends Thread {

    public PriorityMethod(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -Priority : " + Thread.currentThread().getPriority() + " -Count : " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        // Create Thread Using Name
        PriorityMethod MIN = new PriorityMethod("MIN Thread : 1");
        PriorityMethod MAX = new PriorityMethod("MAX Thread : 2");
        PriorityMethod NORMAL = new PriorityMethod("NORMAL Thread : 3");

        // setPriority for all 3 Thread
        MIN.setPriority(Thread.MIN_PRIORITY);
        MAX.setPriority(Thread.MAX_PRIORITY);
        NORMAL.setPriority(Thread.NORM_PRIORITY);

        // Start All Thread
        MIN.start();
        MAX.start();
        NORMAL.start();
    }
}
