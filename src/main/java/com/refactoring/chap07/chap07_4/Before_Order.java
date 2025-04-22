package com.refactoring.chap07.chap07_4;

/**
 * 함수 안에서 코드의 결괏값을 뒤에서 다시 참조할 목적으로 임시 변수를 사용 → 이 임시 변수를 아예 함수로 만들어 사용하는 편이 나을때도 있음
 * 변수 대신 함수로 만들어두면 비슷한 계산을 수행하는 다른 함수에서도 사용할 수 있어 코드 중복이 사라짐
 * 변수는 값을 한 번만 계산하고, 그 뒤로는 읽기만 해야 함
 * 변수에 값을 한 번 대입한 뒤 더 복잡한 코드 덩어리에서 여러 차례 다시 대입하는 경우 → 모두 질의 함수로 추출해야함
 * */
public class Before_Order {
    protected int quantity;
    protected Item item;

    public Before_Order(int quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }
    
    public double getPrice() {
        int basePrice = quantity * item.price;
        double discountFactor = 0.98; 
        
        if (basePrice > 1000) discountFactor -= 0.03; 
        return basePrice * discountFactor;
    }
}