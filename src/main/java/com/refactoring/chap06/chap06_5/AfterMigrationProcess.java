package com.refactoring.chap06.chap06_5;

public class AfterMigrationProcess {
    public double circum(double radius) {
        return circumference(radius);
    }

    public double circumference(double radius) {
        return 2 * Math.PI * radius;
    }
}