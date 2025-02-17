package com.practice.multithreding.threadmethods;

/**
 * Author: Sandeep Singh
 * Date: 13/02/25
 */

/*
join()
sleep()
start()
run()
*/
public class ThreadMethod extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("My Thread : "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethod t1 = new ThreadMethod();
        System.out.println(System.currentTimeMillis());
        t1.start();
        t1.join();
        System.out.println("Print Hello After Complete t1 Thread Task");
        System.out.println(System.currentTimeMillis());

    }


}
