package com.example.ex;

public class Q13 {
    public static void main(String[] args) {
        int [] Arr = {20,55,67,82,45,33,90,87,100,25};
        int total = 0;
        for (int arr : Arr) {
            if (50 <= arr) {
                total += arr;
            }
        }
        System.out.println(total);
    }
}
