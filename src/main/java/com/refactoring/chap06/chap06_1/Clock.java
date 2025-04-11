package com.refactoring.chap06.chap06_1;

import java.time.LocalDateTime;

public class Clock {
    public static LocalDateTime today() {
        return LocalDateTime.now();
    }
}