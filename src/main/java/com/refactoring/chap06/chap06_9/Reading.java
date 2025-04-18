package com.refactoring.chap06.chap06_9;

public class Reading {
    protected Customer customer;
    protected int quantity;
    protected int month;
    protected int year;

    public Reading(Customer customer, int quantity, int month, int year) {
        this.customer = customer;
        this.quantity = quantity;
        this.month = month;
        this.year = year;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}