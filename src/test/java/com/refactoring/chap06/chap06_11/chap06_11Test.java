package com.refactoring.chap06.chap06_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class chap06_11Test {

    @Test
    void test() throws Exception {
        Product product = new Product();
        product.basePrice = 100;
        product.discountRate = 1; // 100%
        product.discountThreshold = 10;

        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.discountThreshold = 2000;
        shippingMethod.discountFee = 10;
        shippingMethod.feePerCase = 20;

        Before before = new Before();
        int quantity = 5;

        // basePrice = 100 * 5 = 500
        // discount = max(5 - 10, 0) * 100 * 1 = 0
        // shippingPerCase = 500 < 2000 → 20
        // shippingCost = 5 * 20 = 100
        // price = 500 - 0 * 100 = 500

        After after = new After();

        double beforeResult = before.priceOrder(product, quantity, shippingMethod);
        double afterResult = after.priceOrder(product, quantity, shippingMethod);
        assertEquals(500, beforeResult, afterResult);
    }


}