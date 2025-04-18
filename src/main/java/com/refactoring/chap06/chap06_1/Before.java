package com.refactoring.chap06.chap06_1;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * 6.1 함수 추출하기
 * Extract Function
 *
 *
 * */
public class Before {

    public String printOwing(Invoice invoice) {
        int outstanding = 0;
        StringBuilder result = new StringBuilder();

        result.append("*****************\n");
        result.append("**** 고객 채무 ****\n");
        result.append("*****************\n");

        // 미해결 채무 (outstanding) 을 계산한다.
        for (Order o : invoice.getOrders()) {
            outstanding += o.amount;
        }

        // 마감일(dueDate) 을 기록한다.
        LocalDateTime dateTime = LocalDateTime.parse("2025-05-11T16:40:34.844685");
        invoice.dueDate = dateTime.plusDays(30);

        // 세부 사항을 문자열에 추가
        result.append(String.format("고객명: %s\n", invoice.customer));
        result.append(String.format("채무액: %d\n", outstanding));
        result.append(String.format("마감일: %s", invoice.dueDate));

        return result.toString();
    }
}
