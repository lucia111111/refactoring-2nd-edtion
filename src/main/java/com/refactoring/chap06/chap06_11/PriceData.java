package com.refactoring.chap06.chap06_11;

public class PriceData {
    protected int basePrice;
    protected int quantity;
    protected int discount;

    public PriceData(int quantity, int discount, int basePrice) {
        this.quantity = quantity;
        this.discount = discount;
        this.basePrice = basePrice;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getDiscount() {
        return discount;
    }
}