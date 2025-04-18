package com.refactoring.chap06.chap06_10;

public class Reading implements Cloneable{
    protected Customer customer;
    protected int quantity;
    protected int month;
    protected int year;

    protected double baseCharge;
    protected double taxableCharge;

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

    public double getBaseCharge() {
        return baseCharge;
    }

    public void setBaseCharge(double baseCharge) {
        this.baseCharge = baseCharge;
    }

    public double getTaxableCharge() {
        return taxableCharge;
    }

    public void setTaxableCharge(double taxableCharge) {
        this.taxableCharge = taxableCharge;
    }


    @Override
    protected Reading clone() throws CloneNotSupportedException {
        return (Reading) super.clone();
    }


}