package com.example.ex;

import java.util.Scanner;

public class Q16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("총합을 구할 숫자 입력: ");
        String s = sc.nextLine();
        String [] Num=s.split(" ");
        int total= 0;
        for (String num : Num) {
            num=num.trim();
            int n = Integer.parseInt(num);
            total+=n;
        }
        System.out.printf("합: %d", total);
    }
}
