package com.practice.multithreding.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Author: Sandeep Singh
 * Date: 20/02/25
 */

public class ExecutorExample {

    public static long factorial(int val) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int data = 1;
        for (int i = 1; i <= val; i++) {
            data *= i;
        }
        return data;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(20);
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                long factorial = factorial(finalI);
                System.out.println(factorial);
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total time Taken :: " + (System.currentTimeMillis() - startTime));
    }
}
