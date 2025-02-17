package com.practice.multithreding.threadmethods;

/**
 * Author: Sandeep Singh
 * Date: 16/02/25
 */

public class SetDaemon extends Thread {

    @Override
    public void run() {
       while (true){
           System.out.println("Running...!!!");
       }
    }

    public static void main(String[] args) {
        SetDaemon t1 = new SetDaemon();
        t1.setDaemon(true);
        t1.start();
        System.out.println("Done");
    }
}
