package com.practice.multithreding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: Sandeep Singh
 * Date: 08/02/25
 */


class TwoThreadPrintOddEven {
    private static final int MAX = 10; // Maximum limit tak numbers print karne ke liye
    private static int counter = 1; // Counter jo dono tasks share karenge
    private static final Object lock = new Object(); // Lock object for synchronization

    // Task to print even numbers
    public static Runnable printEven = () -> {
        while (true) {
            synchronized (lock) {
                if (counter > MAX) break; // Exit condition
                if (counter % 2 == 0) { // Check if number is even
                    System.out.println(Thread.currentThread().getName() + " : " + counter);
                    counter++;
                    lock.notify(); // Notify the odd task
                } else {
                    try {
                        lock.wait(); // Wait for the odd task
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    };

    // Task to print odd numbers
    public static Runnable printOdd = () -> {
        while (true) {
            synchronized (lock) {
                if (counter > MAX) break; // Exit condition
                if (counter % 2 != 0) { // Check if number is odd
                    System.out.println(Thread.currentThread().getName() + " : " + counter);
                    counter++;
                    lock.notify(); // Notify the even task
                } else {
                    try {
                        lock.wait(); // Wait for the even task
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    };

    public static void main(String[] args) {
        // Create a thread pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit tasks to the executor
        executor.submit(TwoThreadPrintOddEven.printEven);
        executor.submit(TwoThreadPrintOddEven.printOdd);

        // Shutdown the executor after tasks are done
        executor.shutdown();
    }
}
