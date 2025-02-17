package com.practice.multithreding;

/**
 * Author: Sandeep Singh
 * Date: 14/02/25
 */

class Printer {
    private int counter = 1;
    private final int MAX_COUNT = 5;

    public synchronized void printNumber(int threadId) {
        for (int i = 0; i < 5; i++) { // Each thread prints 5 times
            while (counter % MAX_COUNT != threadId) {
                try {
                    wait(); // Wait until it's this thread's turn
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread-" + threadId + " prints: " + counter);
            counter++;
            notifyAll(); // Notify all waiting threads
        }
    }
}

class WorkerThread extends Thread {
    private final Printer printer;
    private final int threadId;

    public WorkerThread(Printer printer, int threadId) {
        this.printer = printer;
        this.threadId = threadId;
    }

    @Override
    public void run() {
        printer.printNumber(threadId);
    }
}

public class MultiThreadPrint {
    public static void main(String[] args) {
        Printer printer = new Printer();

        // Create 5 threads
        for (int i = 0; i < 5; i++) {
            new WorkerThread(printer, i).start();
        }
    }
}
