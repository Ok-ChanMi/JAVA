package com.example.ex;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단을 출력할 숫자를 입렵하세요(2~9): ");
        int num = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d", i * num);
        }
    }
}
