package com.practice.multithreding.basicThread;

/**
 * Author: SANDEEP
 * Date: 06/01/25
 */

public class ThreadSetPriority extends Thread {

    public static void main(String[] args) {
        ThreadSetPriority priority = new ThreadSetPriority();
        priority.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
