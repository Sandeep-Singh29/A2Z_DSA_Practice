package com.practice.multithreding.lambda;

/**
 * Author: Sandeep Singh
 * Date: 18/02/25
 */

public class ThreadUsingLambda {
    public static void main(String[] args) {

        //Way 1
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task-1 Using run() Override");
            }
        };
        // Way 1 to implement a Thread Using Runnable run() implement
        Thread t1 = new Thread(task1);

        //Way 2
        Runnable task2 = () -> {
            System.out.println("Task-2 run() implement using Lambda Expression");
        };

        // Way 2 Implement a Thread Using Lambda Expression Implement a run()
        Thread t2 = new Thread(task2);

        //Way 3
        // Implement a Thread and give run() Implementation using lambda expression
        Thread t3 = new Thread(() -> System.out.println("Task-3 direct run() implementation in Constructor using Lambda Expression"));


        // Run ALL Thread

        t1.start();
        t2.start();
        t3.start();


    }
}
