package com.practice.multithreding.lifecyclethread;

/**
 * Author: Sandeep Singh
 * Date: 12/02/25
 */

public class MyThreadLifeCycle implements Runnable {

    @Override
    public void run() {
        System.out.println("RUNNING IN RUN");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThreadLifeCycle myThreadLifeCycle = new MyThreadLifeCycle();
        Thread thread = new Thread(myThreadLifeCycle, "LifeCycleThread");    // 1--NEW STATE
        System.out.println(thread.getState());
        thread.start();                                                            // 2--RUNNABLE/RUNNING is same ya to thread running ka liya wait karegi ya to running state main hogi
        System.out.println(thread.getState());
        Thread.sleep(100);
        System.out.println(thread.getState());
        thread.join(); // thread pe join() call hota hai, toh current thread uska execution rok deta hai jab tak wo thread complete nahi ho jata.
        System.out.println(thread.getState());
    }
}
