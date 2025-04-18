package com.refactoring.chap06.chap06_4;

public class Before {

    public boolean method(Order order) {
        int basePrice = order.basePrice;
        return basePrice > 1000;
    }
}