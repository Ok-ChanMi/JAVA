package com.example.ex;

public class Q14 {
    public static int fibo(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else return fibo(n - 2) + fibo(n - 1);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.println(fibo(i));
        }
    }
}
