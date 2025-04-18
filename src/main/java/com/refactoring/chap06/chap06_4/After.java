package com.refactoring.chap06.chap06_4;

public class After {

    public boolean method(Order order) {
        int basePrice = order.basePrice;
        return basePrice > 1000;
    }
}