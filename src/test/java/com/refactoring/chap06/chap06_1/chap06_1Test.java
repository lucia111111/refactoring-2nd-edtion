package com.refactoring.chap06.chap06_1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class chap06_1Test {

    @Test
    void printOwing() throws Exception {
        // given
//        final String expected = """
//                *****************
//                **** 고객 채무 ****
//                *****************
//                고객명: lucia
//                채무액: 7
//                마감일: 2025-06-10T16:40:34.844685""";
        Invoice invoice = new Invoice();
        invoice.setCustomer("lucia");
        invoice.setOrders(Arrays.asList(new Order(2),new Order(5)));
        Before before = new Before();
        After after = new After();

        // when then
        assertThat(after.printOwing(invoice)).isEqualTo(before.printOwing(invoice));

    }


}