package com.practice.multithreding.basicThread;

/**
 * Author: SANDEEP
 * Date: 06/01/25
 */

public class ThreadState extends Thread{

    @Override
    public void run() {
        System.out.println("RUNNING THREAD");
        try {
            Thread.sleep(2000);
            System.out.println("Work Done After 2000 mSec");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadState state = new ThreadState();
        System.out.println(state.getState());
        state.start();// Start the Thread
        System.out.println(state.getState());
        System.out.println(Thread.currentThread().getState());
        Thread.sleep(100);
        System.out.println(state.getState());
        state.join();
        System.out.println(state.getState());

    }

}

