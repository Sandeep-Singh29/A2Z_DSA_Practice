package com.practice.multithreding.lock;

/**
 * Author: Sandeep Singh
 * Date: 17/02/25
 */

public class LockMainTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Runnable myAnonymousTask = new Runnable() {
            @Override
            public void run() {
                bankAccount.withdraw(50);
            }
        };
        Thread t1 = new Thread(myAnonymousTask, "MyBankThread-1");

        // In Single Line No Need to Override a run() Runnable Interface we have direct pass using lamda expression
        // In upper line we have many line to write
        Thread t2 = new Thread(() -> bankAccount.withdraw(50), "MyBankThread-2");
        t1.start();
        t2.start();



    }
}

/*
WithOut -->> Synchronized Keyword

OutPut :
MyBankThread : 2 : Attempting to withdraw amount : 50
MyBankThread : 2 : Process to  withdraw amount : 50
MyBankThread : 1 : Attempting to withdraw amount : 50
MyBankThread : 1 : Process to  withdraw amount : 50
MyBankThread : 2 : After Withdraw Amount : 50
MyBankThread : 1 : After Withdraw Amount : 0

 */


/*

Using Synchronized Keyword
Jab Tal Ek thread ka Process complete nahi hua tab dusri thread intrect nahi ki

Output :

MyBankThread : 1 : Attempting to withdraw amount : 50
MyBankThread : 1 : Process to  withdraw amount : 50
MyBankThread : 1 : After Withdraw Amount : 50
MyBankThread : 2 : Attempting to withdraw amount : 50
MyBankThread : 2 : Process to  withdraw amount : 50
MyBankThread : 2 : After Withdraw Amount : 0

*/











