package com.practice.multithreding.basicThread;

/**
 * Author: SANDEEP
 * Date: 06/01/25
 */

public class ThreadMethods extends Thread {

    public static void main(String[] args) throws InterruptedException {
        ThreadMethods methods = new ThreadMethods();
        methods.start();
        methods.join();
        System.out.println("Hello");
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
