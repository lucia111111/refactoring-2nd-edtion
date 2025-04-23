package com.refactoring.chap07.chap07_7;

public class After_Person {
    protected String name;
    protected Department department;

    public After_Person(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getManager(){
        return department.getManager();
    }
}