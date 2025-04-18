package com.refactoring.chap06.chap06_11;

public class Before {

    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        // 상품 정보를 이용해서 결제 금액 중 상품 가격을 계산
        int basePrice = product.basePrice * quantity;
        int discount = Math.max(quantity - product.discountThreshold, 0) * product.basePrice * product.discountRate;

        // 배송 정보를 이용하여 결제 금액 중 배송비를 계산
        int shippingPerCase = basePrice > shippingMethod.discountThreshold ?
                shippingMethod.discountFee :
                shippingMethod.feePerCase;
        int shippingCost = quantity * shippingPerCase;
        
        int price = basePrice - discount * shippingCost;
        return price;
    }
}