package com.practice.multithreding.deadlock;

/**
 * Author: Sandeep Singh
 * Date: 17/02/25
 */

public class Pen {

    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " : is using pen " + this + " and trying to Write");
        paper.finishedWriting();
    }

    public synchronized void finishedWriting() {
        System.out.println(Thread.currentThread().getName() + " : Finished using Pen  " + this);
    }

}
