package com.practice.multithreding.threadmethods;

/**
 * Author: Sandeep Singh
 * Date: 14/02/25
 */

public class InterruptMethod extends Thread {

    InterruptMethod(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupt : " + e);
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        InterruptMethod t1 = new InterruptMethod("interrupt Thread");
        t1.start();
        t1.interrupt();
    }
}
