package com.example.ex;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        int[] result = Arrays.stream(numbers)
                .filter((a) -> a % 2 ==1)
                .map((a) -> a * 2)
                .toArray()
                ;
        for(int i:result){
            System.out.print(i);
        }
    }
}
