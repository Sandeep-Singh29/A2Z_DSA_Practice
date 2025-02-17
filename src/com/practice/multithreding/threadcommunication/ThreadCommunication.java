package com.practice.multithreding.threadcommunication;

/**
 * Author: Sandeep Singh
 * Date: 17/02/25
 */


class SharedResource {

    private int data;
    private boolean hasData;

    public synchronized int consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consumed : " + data);
        notify();
        return data;
    }

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced : " + value);
        notify();
    }

}

class Producer implements Runnable {

    private final SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedResource.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private final SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = sharedResource.consume();
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread threadProducer = new Thread(new Producer(resource));
        Thread threadConsumer = new Thread(new Consumer(resource));

        threadProducer.start();
        threadConsumer.start();
    }
}
