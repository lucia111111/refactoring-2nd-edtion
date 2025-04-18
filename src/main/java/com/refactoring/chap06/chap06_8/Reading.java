package com.refactoring.chap06.chap06_8;

import java.time.LocalDateTime;

public class Reading {
    protected int temp;
    protected LocalDateTime time;

    public Reading(int temp, LocalDateTime time) {
        this.temp = temp;
        this.time = time;
    }
}