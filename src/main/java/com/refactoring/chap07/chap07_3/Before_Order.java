package com.refactoring.chap07.chap07_3;

import java.util.List;

public class Before_Order {
    // 기본형 String
    protected String priority;

    public Before_Order(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }

    // 고급이나 급한 우선순위를 가진 주문의 개수 count
    public static long highPriorityCount(List<Before_Order> orders) {
        return orders.stream()
                .filter(o -> "high".equals(o.getPriority()) || "rush".equals(o.getPriority()))
                .count();
    }

    public static void main(String[] args) {
        List<Before_Order> orders = List.of(
                new Before_Order("low"),
                new Before_Order("normal"),
                new Before_Order("high"),
                new Before_Order("rush")
        );

        System.out.println("Before highPriorityCount :: " + highPriorityCount(orders));
    }
}