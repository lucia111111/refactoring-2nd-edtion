package com.refactoring.chap06.chap06_5;

import java.util.ArrayDeque;
import java.util.Queue;

public class AfterAddParameter {
    protected Queue<Customer> reservations = new ArrayDeque<>();

    public void addReservation(Customer customer) {
        priorityAddReservation(customer, false);
    }

    public void priorityAddReservation(Customer customer, boolean isPriority) {
        // isPriority값에 따른 다른 로직 적용
        this.reservations.add(customer);
    }

}