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

    public double baseCharge() {
        return baseRate(this.month, this.year) * this.quantity;
    }

    public double baseRate(int month, int year) {
        return month * year;
    }

    public double taxThreshold(int year) {
        return year;
    }

    public double taxableChargeFn(){
        return Math.max(0, this.baseCharge() - taxThreshold(this.year));
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