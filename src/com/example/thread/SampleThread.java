package com.example.thread;

class Sample extends Thread {
    int seq;
    public Sample(int seq) {
        this.seq = seq;
    }
    public void run() {
        System.out.println("thread start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println(this.seq + "thread end");
    }
}

public class SampleThread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Sample(i);
            thread.start();
        }
        System.out.println("main end");
    }
}
