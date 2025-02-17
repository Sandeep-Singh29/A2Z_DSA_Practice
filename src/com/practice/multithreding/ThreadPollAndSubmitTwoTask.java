package com.practice.multithreding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: SANDEEP
 * Date: 05/11/24
 */

public class ThreadPollAndSubmitTwoTask {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> {
            System.out.println("Task 1 is running by " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 1 completed by " + Thread.currentThread().getName());
        };

        Runnable task2 = () -> {
            System.out.println("Task 2 is running by " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 2 completed by " + Thread.currentThread().getName());
        };

        executor.submit(task1);
        executor.submit(task2);
        executor.isShutdown();


    }

}
