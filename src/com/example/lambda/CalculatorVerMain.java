package com.example.lambda;

//Calculator2 인터페이스
interface Calculator2 {
//    double sum(double... numbers);
    double div(double... numbers);
}

// 람다 표현식을 사용하여 Calculator2 인터페이스 구현
public class CalculatorVerMain {
    public static void main(String[] args) {
        // Calculator2 인터페이스에 대한 메서드 참조를 정의 합니다.
        Calculator2 addition = CalculatorVerMain::sum;
        Calculator2 division = CalculatorVerMain::div;


        // 연산을 테스트
//        System.out.println("덧셈 결과 : " + addition.sum(1,2,3,4,5));
        System.out.println("나눗셈 결과 : " + division.div(10, 2, 3));
    }

    // 덧셈 메서드
    public static double sum(double... numbers) {
        double result = 0;
        for (double number : numbers) {
            result += number;
        }
        return result;
    }


    // 나눗셈 메서드
    public static double div(double... numbers) {
        if (numbers.length < 2) {
            System.out.println("최소 2개의 숫자가 필요합니다.");
            return 0;
        }
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            result += numbers[i];
        }
        return result;
    }
}

