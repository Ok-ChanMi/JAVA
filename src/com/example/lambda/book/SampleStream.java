package com.example.lambda.book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class SampleStream {
    public static void main(String[] args) {

        int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 2, 4, 8, 40, 5, 5, 5};
        // 1. 짝수만 포함하는 ArrayList 생성
        ArrayList<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if(data[i] % 2 == 0) {
                dataList.add(data[i]);
            }
        }
        // 2. Set을 사용하여 중복을 제거
        HashSet<Integer> dataSet = new HashSet<>(dataList);

        // 리스트로 변경
        ArrayList<Integer> distincList = new ArrayList<>(dataSet);

        // 3. 역순으로 정렬
        distincList.sort(Comparator.reverseOrder());

        // Integer 리스트를 정수 배열로 반환
        int[] result = new int[distincList.size()];
        for (int i = 0; i < distincList.size(); i++) {
            result[i] = distincList.get(i);
            System.out.println(result[i]);
        }
    }
}
