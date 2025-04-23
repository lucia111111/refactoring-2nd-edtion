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

    // 메서드 분리 -> 여러곳에서 사용 가능
    // 수정 시 메서드 하나만 수정하면 됨
    public int getBasePrice(){
        return quantity * item.price;
    }

    public double getDiscountFactor(){
        double discountFactor = 0.98;
        if (getBasePrice() > 1000) discountFactor -= 0.03;
        return discountFactor;
    }
}