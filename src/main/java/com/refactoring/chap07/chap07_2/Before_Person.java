package com.refactoring.chap07.chap07_2;

import java.util.ArrayList;
import java.util.List;

/**
 * 가변 데이터를 캡슐화 → 데이터 구조가 언제 어떻게 수정되었는지 파악 용이
 * 컬렉션을 감싼 클래스에 흔히 add()와 remove() 라는 컬렉션 변경자 메서드를 생성 → 컬렉션을 소유한 클래스를 통해서만 원소를 변경할 수 있도록
 * */
public class Before_Person {
    protected String name; 
    protected List<Before_Course> courses = new ArrayList<>();

    public Before_Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Before_Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Before_Course> courses) {
        this.courses = courses;
    }

    public static void main(String[] args) {
        Before_Person person = new Before_Person("lucia");
        // 외부에서 직접 courses 리스트 수정 가능
        person.courses.add(new Before_Course("math", true));
    }
}