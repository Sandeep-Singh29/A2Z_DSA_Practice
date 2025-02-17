package com.practice.multithreding.deadlock;

/**
 * Author: Sandeep Singh
 * Date: 17/02/25
 */

public class Task1 implements Runnable{

    private Paper paper;
    private Pen pen;

    public Task1(Paper paper, Pen pen) {
        this.paper = paper;
        this.pen = pen;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper); // Thread1 locks pen and tries to lock paper.
    }
}
