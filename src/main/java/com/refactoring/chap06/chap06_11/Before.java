package com.refactoring.chap06.chap06_11;

public class Before {

    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        int basePrice = product.basePrice * quantity;
        int discount = Math.max(quantity - product.discountThreshold, 0) * product.basePrice * product.discountRate;
        int shippingPerCase = basePrice > shippingMethod.discountThreshold ?
                shippingMethod.discountFee :
                shippingMethod.feePerCase;
        int shippingCost = quantity * shippingPerCase;
        int price = basePrice - discount * shippingCost;
        return price;
    }
}