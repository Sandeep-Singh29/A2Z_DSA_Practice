package com.practice.multithreding.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Sandeep Singh
 * Date: 17/02/25
 */

public class ReentrantLockExample {

    private final Lock lock = new ReentrantLock();

    public void outer() {
        lock.lock();
        try {
            System.out.println("outer Method Called...!!!");
            inner();
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            System.out.println(e.getLocalizedMessage());
        } finally {
            lock.unlock();
        }
    }

    private void inner() {
        lock.lock();
        try {
            System.out.println("Inner Method Called...!!!");
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            System.out.println(e.getLocalizedMessage());
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {

        ReentrantLockExample lock = new ReentrantLockExample();
        lock.outer();

    }
}
