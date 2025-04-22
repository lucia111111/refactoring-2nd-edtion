package com.refactoring.chap07.chap07_7;

public class After_Person {
    protected String name;
    protected After_Department department;

    public After_Person(String name) {
        this.name = name;
    }

    public After_Department getDepartment() {
        return department;
    }

    public void setDepartment(After_Department department) {
        this.department = department;
    }

    public String getManager(){
        return department.getManager();
    }
}