package com.refactoring.chap07.chap07_4;

public class Before_Order {
    protected int quantity;
    protected Item item;

    public Before_Order(int quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }

    // 계산결과를 저장하는 basePrice가 메서드 여러 곳에서 사용되면 -> 값을 추적하기 어려워지고 수정시 오류가 발생할 수도 있음
    // 동일한 계산식 재사용할 경우, 중복 발생 -> 메서드 분리
    public double getPrice() {
        int basePrice = quantity * item.price;
        double discountFactor = 0.98; 
        
        if (basePrice > 1000) discountFactor -= 0.03; 
        return basePrice * discountFactor;
    }
}