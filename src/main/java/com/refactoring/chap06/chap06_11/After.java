package com.refactoring.chap06.chap06_11;

public class After {

    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        int basePrice = product.basePrice * quantity;
        int discount = Math.max(quantity - product.discountThreshold, 0) * product.basePrice * product.discountRate;

        PriceData priceData = new PriceData();
        int price = applyShipping(priceData, quantity, shippingMethod, basePrice, discount);
        return price;
    }

    private int applyShipping(PriceData priceData, int quantity, ShippingMethod shippingMethod, int basePrice, int discount) {
        int shippingPerCase = basePrice > shippingMethod.discountThreshold ? shippingMethod.discountFee : shippingMethod.feePerCase;
        int shippingCost = quantity * shippingPerCase;
        int price = basePrice - discount * shippingCost;
        return price;
    }
}