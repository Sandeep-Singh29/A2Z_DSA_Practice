package com.practice.multithreding.deadlock;

/**
 * Author: Sandeep Singh
 * Date: 17/02/25
 */

public class Task2 implements Runnable {

    private Paper paper;
    private Pen pen;

    public Task2(Paper paper, Pen pen) {
        this.paper = paper;
        this.pen = pen;
    }

    @Override
    public void run() {
        paper.writeWithPaperAndPen(pen); // Thread1 locks Paper and tries to lock Pen.
    }

}
