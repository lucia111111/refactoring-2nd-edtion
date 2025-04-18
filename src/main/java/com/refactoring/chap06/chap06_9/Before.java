package com.refactoring.chap06.chap06_9;

public class Before {

    public void client01(){
        Reading reading = acquireReading();
        double baseCharge = baseRate(reading.month, reading.year) * reading.quantity;
    }

    public void client02(){
        Reading reading = acquireReading();
        double base = (baseRate(reading.month, reading.year) * reading.quantity);
        double taxableCharge = Math.max(0, base - taxThreshold(reading.year));
    }

    public Reading acquireReading(){
        return new Reading(new Customer("ivan"),10,5,2017);
    }

    public double baseRate(int month, int year) {
        return month * year;
    }

    public double taxThreshold(int year) {
        return year;
    }
}
