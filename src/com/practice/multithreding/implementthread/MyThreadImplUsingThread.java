package com.practice.multithreding.implementthread;

/**
 * Author: Sandeep Singh
 * Date: 12/02/25
 */

public class MyThreadImplUsingThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : Hello  " + i);
        }
    }

    public static void main(String[] args) {

        MyThreadImplUsingThread implUsingThread = new MyThreadImplUsingThread();
        implUsingThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : Main Hello  " + i);
        }


    }
}
