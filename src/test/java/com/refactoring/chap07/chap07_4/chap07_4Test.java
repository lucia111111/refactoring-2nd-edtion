package com.refactoring.chap07.chap07_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class chap07_4Test {

    @Test
    void test(){
        // given
        Item item = new Item(1000);
        Before_Order beforeOrder = new Before_Order(100, item);
        After_Order afterOrder = new After_Order(100, item);

        // when, then
        Assertions.assertTrue(beforeOrder.getPrice() == afterOrder.getPrice());
    }
}