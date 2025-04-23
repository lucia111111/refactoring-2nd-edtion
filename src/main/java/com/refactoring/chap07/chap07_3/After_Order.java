package com.refactoring.chap07.chap07_3;

import java.util.List;

public class After_Order {

    // Priority 객체를 사용하여 우선순위 캡슐화
    protected After_Priority priority;

    public After_Order(String priority) {
        this.priority = new After_Priority(priority);
    }

    public After_Priority getPriority() {
        return priority;
    }

    public static long highPriorityCount(List<After_Order> orders) {
        return orders.stream()
                .filter(o -> o.getPriority().isHighOrRush())
                .count();
    }

    public static void main(String[] args) {
        List<After_Order> orders = List.of(
                new After_Order("low"),
                new After_Order("normal"),
                new After_Order("high"),
                new After_Order("rush")
        );

        System.out.println("After highPriorityCount :: " + highPriorityCount(orders)); // 출력: 2

    }

}