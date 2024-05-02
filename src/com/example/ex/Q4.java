package com.example.ex;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] number = {1,-2,3,-5,8,-3};
        int[] result = Arrays.stream(number)
                .filter((a) -> a >= 0)
                .toArray()
                ;
        for (int i : result) {
            System.out.println(i);
        }
    }
}
