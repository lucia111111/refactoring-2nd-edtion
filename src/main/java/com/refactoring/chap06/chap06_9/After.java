package com.refactoring.chap06.chap06_9;

public class After {

    public void client01(){
        Reading reading = acquireReading();
        double baseCharge = reading.baseCharge();
    }

    public void client02(){
        Reading reading = acquireReading();
        double taxableCharge = reading.taxableChargeFn();
    }

    public Reading acquireReading(){
        return new Reading(new Customer("ivan"),10,5,2017);
    }

}
