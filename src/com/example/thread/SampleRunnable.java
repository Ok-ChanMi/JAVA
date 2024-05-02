package com.example.thread;

import java.util.ArrayList;

public class SampleRunnable {
    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Sample(i));
            thread.start();
            threads.add(thread);
        }
        for (int i = 0; i < 10; i++) {
            Thread t = threads.get(i);
            try {
                t.join();
            } catch (InterruptedException e) {

            }

        }
        System.out.println("main end");
    }
}
