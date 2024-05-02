package com.example.lambda.book;

@FunctionalInterface
interface Calculator{
    int sum(int a, int b);
}

public class Sample {
    public static void main(String[] args) {
//        Calculator mc = (a, b) -> a + b;
        // 메서드 참조  ::을 사용하여 이 메서드는 'Calculator' 인터페이스의 'sum' 메서드 연결
        Calculator mc =Integer::sum;
        int result = mc.sum(1, 2);
        System.out.println(result);
    }
}
