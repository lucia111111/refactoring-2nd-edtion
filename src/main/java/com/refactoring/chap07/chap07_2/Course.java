package com.refactoring.chap07.chap07_2;

public class Course {
    protected String name; 
    protected boolean isAdvanced;

    public Course(String name, boolean isAdvanced) {
        this.name = name;
        this.isAdvanced = isAdvanced;
    }

    public String getName() {
        return name;
    }

    public boolean isAdvanced() {
        return isAdvanced;
    }
}