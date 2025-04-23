package com.refactoring.chap07.chap07_2;

import java.util.ArrayList;
import java.util.List;

/**
 * courses를 getCourse()로 가져와도 복사본이기 때문에 원본 변경 불가
 * addCourse, removeCourse 메서드를 통해서만 수정 가능
 * */
public class After_Person {
    protected String name;
    protected List<Course> courses = new ArrayList<>();

    public After_Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 원본 그대로가 아닌 복사본 제공(리스트 직접 노출x)
    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    // 기존 setCourses() 제거, 대신 원소 추가/삭제 메서드 추가

    public void addCourse(Course course){
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