package com.refactoring.chap06.chap06_11;

public class After {

    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        int basePrice = product.basePrice * quantity;
        int discount = Math.max(quantity - product.discountThreshold, 0) * product.basePrice * product.discountRate;
        PriceData priceData = new PriceData(quantity, discount, basePrice);
        return applyShipping(priceData, shippingMethod);
    }

    private int applyShipping(PriceData priceData, ShippingMethod shippingMethod) {
        int shippingPerCase = priceData.getBasePrice() > shippingMethod.discountThreshold ? shippingMethod.discountFee : shippingMethod.feePerCase;
        int shippingCost = priceData.getQuantity() * shippingPerCase;
        return priceData.getBasePrice() - priceData.getDiscount() * shippingCost;
    }
}