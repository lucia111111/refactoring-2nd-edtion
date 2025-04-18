package com.refactoring.chap06.chap06_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class chap06_3Test {

    @Test
    void test() throws Exception {
        // given
        Before before = new Before();
        Order order = new Order(1, 1000);
        After after = new After();
        before.price(order);

        // when, then
        Assertions.assertTrue(before.price(order) == after.price(order));
    }


}