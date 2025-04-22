package com.refactoring.chap07.chap07_4;


public class After_Order {
    protected int quantity;
    protected Item item;

    public After_Order(int quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }
    
    public double getPrice() {
        return getBasePrice() * getDiscountFactor();
    }

    public int getBasePrice(){
        return quantity * item.price;
    }

    public double getDiscountFactor(){
        double discountFactor = 0.98;
        if (getBasePrice() > 1000) discountFactor -= 0.03;
        return discountFactor;
    }
}