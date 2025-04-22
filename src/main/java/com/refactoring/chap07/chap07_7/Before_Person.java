package com.refactoring.chap07.chap07_7;

public class Before_Person {
    protected String name;
    protected Before_Department department;
    
    public Before_Person(String name) {
        this.name = name;
    }

    public Before_Department getDepartment() {
        return department;
    }

    public void setDepartment(Before_Department department) {
        this.department = department;
    }
}