package com.practice.multithreding.basicThread;

/**
 * Author: SANDEEP
 * Date: 06/01/25
 */

public class CreateThreadUsingThreadClass extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            System.out.println("Hello : " + i + "  Thread Name :  " + Thread.currentThread().getName());
        }
    }


    public static void main(String[] args) {
        CreateThreadUsingThreadClass threadClass = new CreateThreadUsingThreadClass();
        threadClass.start();
    }
}
