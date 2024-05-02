package com.example.thread;

/**
 * 각  요리사의 쓰레드가 모두 종료될 때까지 join() 메서드를 사용하여 대기합니다.
 * 그리고나서 "배달을 합니다." 메세지 출력합니다.
 * 이렇게 하면 모든 요리가 완료된 후에 배달을 시작합니다.
 */

public class RestaurantJoinMain {
    public static void main(String[] args) {
        Chef chef1 = new Chef("요리사1","스테이크");
        Chef chef2 = new Chef("요리사2","파스타");
        Chef chef3 = new Chef("요리사3","샐러드");

        chef1.start();
        chef2.start();
        chef3.start();

        // 각 요리사의 쓰레드가 종료될 때까지 기다림
        try {
            chef1.join();
            chef2.join();
            chef3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 모든 요리가 완료된 후에 배달을 합니다.
        System.out.println("배달을 합니다.");
    }
}
