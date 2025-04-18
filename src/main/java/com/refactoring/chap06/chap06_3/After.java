package com.refactoring.chap06.chap06_3;

public class After {
    public double price(Order order) {
        double basePrice = order.quantity * order.itemPrice;
        double quantityDiscount = Math.max(0, order.quantity - 500) * order.itemPrice * 0.05;
        double shipping = Math.min(basePrice * 0.1 , 100);
                // 가격(price) = 기본 가격 - 수량 할인 + 배송비
        return  basePrice - quantityDiscount + shipping;
    }
}