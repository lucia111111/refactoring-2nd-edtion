package com.refactoring.chap06.chap06_8;

import java.util.ArrayList;
import java.util.List;

public class Station {

    protected String name;
    protected List<Reading> readings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Reading> getReadings() {
        return readings;
    }

    public void setReadings(List<Reading> readings) {
        this.readings = readings;
    }

}