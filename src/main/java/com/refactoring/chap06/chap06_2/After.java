package com.refactoring.chap06.chap06_2;

public class After {

    public int rating(Driver driver) {
        return driver.numberOfLateDeliveries > 5 ? 2 : 1;
    }
}
