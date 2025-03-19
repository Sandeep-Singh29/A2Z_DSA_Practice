package com.practice.multithreding.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: Sandeep Singh
 * Date: 20/02/25
 */

public class Executor2 {

    public static long factorial(int val) {
        try {
            Thread.sleep(1000);
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
        ExecutorService executor = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executor.execute(() -> {
                long factorial = factorial(finalI);
                System.out.println(factorial);
            });
        }
        executor.shutdown();
    }
}
