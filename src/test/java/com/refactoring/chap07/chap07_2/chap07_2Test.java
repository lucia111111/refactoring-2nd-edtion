package com.refactoring.chap07.chap07_2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class chap07_2Test {

    @Test
    void before_test() throws Exception {
        // given
        Before_Person person = new Before_Person("lucia");
        Course course1 = new Course("리팩터링", true);
        Course course2 = new Course("클린 코드", false);
        List<Course> courses = List.of(course1, course2);
        person.setCourses(courses);

        // when, then
        assertEquals(2, courses.size());
        assertTrue(courses.contains(course1));
        assertTrue(courses.contains(course2));
    }

    @Test
    void after_test() throws Exception {
        // given
        After_Person person = new After_Person("lucia");
        Course course1 = new Course("리팩터링", true);
        Course course2 = new Course("클린 코드", false);
        person.addCourse(course1);
        person.addCourse(course2);

        // when, then
        List<Course> afterCourses = person.getCourses();
        assertTrue(afterCourses.contains(course1));
        assertTrue(afterCourses.contains(course2));
    }


}