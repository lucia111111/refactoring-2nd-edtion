package com.refactoring.chap06.chap07_2;

import com.refactoring.chap06.chap06_11.After;
import com.refactoring.chap06.chap06_11.Before;
import com.refactoring.chap06.chap06_11.Product;
import com.refactoring.chap06.chap06_11.ShippingMethod;
import com.refactoring.chap07.chap07_2.After_Course;
import com.refactoring.chap07.chap07_2.After_Person;
import com.refactoring.chap07.chap07_2.Before_Course;
import com.refactoring.chap07.chap07_2.Before_Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class chap07_2Test {

    @Test
    void before_test() throws Exception {
        // given
        Before_Person person = new Before_Person("lucia");
        Before_Course course1 = new Before_Course("리팩터링", true);
        Before_Course course2 = new Before_Course("클린 코드", false);
        List<Before_Course> courses = List.of(course1, course2);
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
        After_Course course1 = new After_Course("리팩터링", true);
        After_Course course2 = new After_Course("클린 코드", false);
        person.addCourse(course1);
        person.addCourse(course2);

        // when, then
        List<After_Course> afterCourses = person.getCourses();
        assertTrue(afterCourses.contains(course1));
        assertTrue(afterCourses.contains(course2));
    }


}