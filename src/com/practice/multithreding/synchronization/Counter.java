package com.practice.multithreding.synchronization;

/**
 * Author: Sandeep Singh
 * Date: 16/02/25
 */

public class Counter {

    private int count = 0;

    public /*synchronized*/ void increment() {
        // If not using a synchronized in method
        // This is usefull when u use synchronized in single logic
        synchronized (this){
            count++;
        }
    }

    public int getCount() {
        return count;
    }




}
