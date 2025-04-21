package com.refactoring.chap07.chap07_2;

import java.util.ArrayList;
import java.util.List;

public class After_Person {
    protected String name;
    protected List<After_Course> courses = new ArrayList<>();

    public After_Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 원본 그대로가 아닌 복사본 제공
    public List<After_Course> getCourses() {
        return new ArrayList<>(courses);
    }

    // 기존 setCourses() 제거

    public void addCourse(After_Course course){
        courses.add(course);
    }

    public void removeCourse(int idx){
        try{
            courses.remove(idx);
        }catch(Exception e){
            throw e;
        }

    }
}