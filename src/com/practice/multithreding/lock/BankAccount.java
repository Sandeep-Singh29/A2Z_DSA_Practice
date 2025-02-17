package com.practice.multithreding.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Sandeep Singh
 * Date: 17/02/25
 */

public class BankAccount {

    private int balance = 100;

    private final Lock lock = new ReentrantLock();


    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " : Attempting to withdraw amount : " + amount);
        try {
            if (lock.tryLock(3000, TimeUnit.MILLISECONDS)) {
                System.out.println("Locking : " + Thread.currentThread().getName());
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " : Process to  withdraw amount : " + amount);
                        Thread.sleep(2000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " : After Withdraw Amount : " + balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println(e.getLocalizedMessage());
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " : Amount is Sufficient : " + amount);
                }
            } else {
                // 2 Sec Wait kiya apni bari ana ka but dusra thread jadha time la liya kaam karna main
                // to thread 2 sec sa jadha wait nahi karaga aur aga badh jayaga.
                System.out.println(Thread.currentThread().getName() + " Could Not Acquire the Lock, Will try Again: ");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }

    }

  /*  public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " : Attempting to withdraw amount : " + amount);
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " : Process to  withdraw amount : " + amount);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance-=amount;
            System.out.println(Thread.currentThread().getName() + " : After Withdraw Amount : " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " : Amount is Sufficient : " + amount);
        }
    }*/

}
