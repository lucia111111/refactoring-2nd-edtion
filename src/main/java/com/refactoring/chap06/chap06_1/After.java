package com.refactoring.chap06.chap06_1;

import java.time.LocalDateTime;

/**
 * 6.1 함수 추출하기
 * Extract Function
 *
 *
 * */
public class After {

    public String printOwing(Invoice invoice) throws Exception{
        StringBuilder result = new StringBuilder();

        printBanner(result);

        int outstanding = calculateOutstanding(invoice);

        Invoice addDueDateInvoice = recordDueDate(invoice);

        printDetails(addDueDateInvoice, result, outstanding);

        return result.toString();
    }

    private int calculateOutstanding(Invoice invoice) {
        // 미해결 채무 (outstanding) 을 계산한다.
        int result = 0;
        for (Order o : invoice.getOrders()) {
            result += o.amount;
        }
        return result;
    }

    private Invoice recordDueDate(Invoice invoice) throws Exception {
        Invoice resultInvoice = invoice.clone();
        // 마감일(dueDate) 을 기록한다.
        LocalDateTime dateTime = LocalDateTime.parse("2025-05-11T16:40:34.844685");
        resultInvoice.dueDate = dateTime.plusDays(30);

        return resultInvoice;
    }

    private void printDetails(Invoice invoice, StringBuilder result, int outstanding) {
        // 세부 사항을 문자열에 추가
        result.append(String.format("고객명: %s\n", invoice.customer));
        result.append(String.format("채무액: %d\n", outstanding));
        result.append(String.format("마감일: %s", invoice.dueDate));
    }

    private void printBanner(StringBuilder sb){
        sb.append("*****************\n");
        sb.append("**** 고객 채무 ****\n");
        sb.append("*****************\n");
    }

}
