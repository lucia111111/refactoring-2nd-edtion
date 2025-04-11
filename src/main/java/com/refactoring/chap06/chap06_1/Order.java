package com.refactoring.chap06.chap06_1;

public class Order {
    protected int amount;

    public Order(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}