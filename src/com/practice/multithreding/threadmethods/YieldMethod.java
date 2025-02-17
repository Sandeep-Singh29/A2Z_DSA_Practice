package com.practice.multithreding.threadmethods;

/**
 * Author: Sandeep Singh
 * Date: 14/02/25
 */

public class YieldMethod extends Thread {

    YieldMethod(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            Thread.yield();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        YieldMethod t1 = new YieldMethod("t1 Thread");
        YieldMethod t2 = new YieldMethod("t2 Thread");
        t1.start();
        t2.start();
    }
}
