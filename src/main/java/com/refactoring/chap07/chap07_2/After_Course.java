package com.refactoring.chap07.chap07_2;

public class After_Course {
    protected String name; 
    protected boolean isAdvanced;

    public After_Course(String name, boolean isAdvanced) {
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