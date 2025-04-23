package com.refactoring.chap07.chap07_2;

import java.util.ArrayList;
import java.util.List;


public class Before_Person {
    protected String name; 
    protected List<Course> courses = new ArrayList<>();

    public Before_Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public static void main(String[] args) {
        Before_Person person = new Before_Person("lucia");
        // 외부에서 직접 courses 리스트 수정 가능
        person.courses.add(new Course("math", true));
    }
}