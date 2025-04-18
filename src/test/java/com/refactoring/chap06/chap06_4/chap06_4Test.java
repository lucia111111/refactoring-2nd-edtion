package com.refactoring.chap06.chap06_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class chap06_4Test {

    @Test
    void test() throws Exception {
        // given
        Before before = new Before();
        Order order = new Order(11000);
        After after = new After();

        // when, then
        Assertions.assertTrue(before.method(order) == after.method(order));
    }


}