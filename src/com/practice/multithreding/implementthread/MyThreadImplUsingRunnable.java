package com.practice.multithreding.implementthread;

/**
 * Author: Sandeep Singh
 * Date: 12/02/25
 */

public class MyThreadImplUsingRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Hello : " + i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyThreadImplUsingRunnable());
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Hello Main : " + i);
        }

    }

}
