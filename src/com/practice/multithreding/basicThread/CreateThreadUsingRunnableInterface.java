package com.practice.multithreding.basicThread;

/**
 * Author: SANDEEP
 * Date: 06/01/25
 */

public class CreateThreadUsingRunnableInterface implements Runnable {


    public static void main(String[] args) {
        CreateThreadUsingRunnableInterface runnableInterface = new CreateThreadUsingRunnableInterface();
        Thread t1 = new Thread(runnableInterface);
        t1.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            System.out.println("Hello : " + i + "  Thread Name :  " + Thread.currentThread().getName());
        }
    }
}
