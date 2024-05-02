package com.example.excetion;


// 커피 재료가 부족할 때 예외 클래스 정의
class CoffeeMachineException extends Exception {
    public CoffeeMachineException(String message) {
        super(message);
    }
}
// 커피 머신 클래스
class CoffeeMachine{
    private int coffeeStock = 10; // 커피 재고
    // 커피 주문 메서드
    public void orderCoffee(int quantity) throws CoffeeMachineException {
        if (quantity > coffeeStock) {
            throw new CoffeeMachineException("재고 부족 합니다.");
        }
    }
}
public class CoffeeMachineMain {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        try {
            coffeeMachine.orderCoffee(11);
        } catch (CoffeeMachineException e) {
            e.getMessage();
            System.out.println("커피 부족하니 다른 음료를 선택하세요!");
        }

    }
}
