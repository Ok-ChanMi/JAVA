package com.example.lambda.book;

import java.util.Arrays;
import java.util.Comparator;

public class SampleRealStream {
    public static void main(String[] args) {
        int []data = {1,2,3,4,5,3,5,8,0,3};
        int []result = Arrays.stream(data)
                .boxed() //IntStream을 Stream<Integer>로 변경
                .filter((a) -> a % 2 == 0 ) // 짝수만 뽑아낸다.
                .distinct() // 중복을 제거, 같은 값은 무시
                //Comparator 인터페이스에 compare 메서드는 두 개의 객체를 인자로 받아 비교하여
                //첫 번째 객체가 작으면 음수 , 같으면 0, 크면 양수 반환함
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue) //스트림의 요소를 정수값으로 변환하는 메서드
                .toArray()
                ;
    }
}
