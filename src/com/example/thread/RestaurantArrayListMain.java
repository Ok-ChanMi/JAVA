package com.example.thread;

import java.util.ArrayList;

/**
 * chef1, chef2, chef3을 ArrayList에 추가하고 for~each 루프를 사용하여
 * 각 쓰레드에 대해 join() 메서드를 호출하는 코드를 작성해보세요.
 */
public class RestaurantArrayListMain {
    public static void main(String[] args) {
        // 요리사들을 ArrayList에 추가 합니다.
        ArrayList<Chef> chefs = new ArrayList<>();
        chefs.add(new Chef("요리사1", "스테이크"));
        chefs.add(new Chef("요리사2", "파스타"));
        chefs.add(new Chef("요리사3", "샐러드"));

        // 요리사들의 쓰레드를 시작 합니다.
        for(Chef chef : chefs){
            chef.start();
        }
        // 각 요리사의 쓰레드가 종료될 때 까지 기다립니다.
        for (Chef chef : chefs) {
            try {
                chef.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 모든 요리가 완료된 후에 배달을 시작 합니다.
        System.out.println("배달을 시작합니다.");
    }
}
