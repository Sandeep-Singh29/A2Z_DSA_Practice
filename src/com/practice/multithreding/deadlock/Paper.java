package com.practice.multithreding.deadlock;

/**
 * Author: Sandeep Singh
 * Date: 17/02/25
 */

public class Paper {


    public synchronized void writeWithPaperAndPen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " : is using Paper " + this + " and trying to Write");
        pen.finishedWriting();
    }

    public synchronized void finishedWriting() {
        System.out.println(Thread.currentThread().getName() + " : Finished using Paper  " + this);
    }
}
