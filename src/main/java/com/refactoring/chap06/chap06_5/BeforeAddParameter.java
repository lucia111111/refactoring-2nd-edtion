package com.refactoring.chap06.chap06_5;

import java.util.ArrayDeque;
import java.util.Queue;

public class BeforeAddParameter {
    protected Queue<Customer> reservations = new ArrayDeque<>();

    public void addReservation(Customer customer) {
        this.reservations.add(customer);
    }
}