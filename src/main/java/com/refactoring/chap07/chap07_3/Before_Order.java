package com.refactoring.chap07.chap07_3;

import java.util.List;

/**
 * 단순한 출력 이상의 기능이 필요해지는 순간 → 그 데이터를 표현하는 전용 클래스를 정의
 * 나중에 특별한 동작이 필요해질때 클래스에 추가하면 됨 → 프로그램이 커질수록 점점 유용한 도구가 됨
 * */
public class Before_Order {
    // 기본형 String
    protected String priority;

    public Before_Order(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }

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