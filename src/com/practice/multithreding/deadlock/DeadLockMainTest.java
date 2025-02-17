package com.practice.multithreding.deadlock;

/**
 * Author: Sandeep Singh
 * Date: 17/02/25
 */

public class DeadLockMainTest {
    public static void main(String[] args) {

        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new Task1(paper,pen), "Thread-1");
        Thread t2 = new Thread(new Task1(paper,pen), "Thread-2");
        t1.start();
        t2.start();

    }
}
