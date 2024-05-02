package com.example.ex;

import java.util.ArrayList;

class HeavyWork implements Runnable {
    String name;

    HeavyWork(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        work();
    }
    public void work(){
        for(int i = 0; i<5; i++){
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
        System.out.printf("%s done.\n",this.name);
    }
}


public class Sample {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for (int i = 1; i < 5; i++) {
            Thread t = new Thread(new HeavyWork("Heavy Work " + i));
            threads.add(t);
            t.start();
        }
        for (Thread t : threads) {
            t.join();
        }
        long end = System.currentTimeMillis();
        System.out.printf("elspsed time: %s ms/n",end - start);
    }
}
