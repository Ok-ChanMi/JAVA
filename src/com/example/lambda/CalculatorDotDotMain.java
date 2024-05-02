package com.example.lambda;


/**
 * 'Calculator :: divide' 나눗셈 연산을 수행하는 메서드
 * 메서드 참조(::)를 사용하여 이 메서드를 'Calculator'인터페이스의 'div'메서드와 연결합니다.
 * CalculatorDotDotMain 클래스의 divide 메서드가 호출되어 나눗셈을 수행합니다.
 */
interface Calculator1 {
//    double add(double a, double b);
    double div(double a, double b);

}

// 람다 표현식을 사용하여 Calculator 인터페이스 구현
public class CalculatorDotDotMain {
    public static void main(String[] args) {
        // Calculator 인터페이스에 대한 메서드 참조를 정의 합니다.
        Calculator1 addition = Double::sum;
//        Calculator1 division = Double::div;
        Calculator1 division = CalculatorDotDotMain::divide;

        // 연산 테스트
        double num1 = 10;
        double num2 = 5;

//        System.out.println("덧셈 결과" + addition.add(num1, num2));
        System.out.println("나눗셈 결과" + division.div(num1, num2));
    }
        // 나눗셈 메서드
        public static double divide(double a, double b){
            if( a == 0){
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }else{
                return a/b;
            }
        }
}
