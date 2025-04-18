package com.refactoring.chap06.chap06_8;

import java.util.List;
import java.util.stream.Collectors;

public class Before {
    public List<Reading> readingsOutsideRange(Station station, int min, int max) {
        return station.readings
                .stream()
                .filter(r -> r.temp < min || r.temp > max)
                .collect(Collectors.toList());
    }
}