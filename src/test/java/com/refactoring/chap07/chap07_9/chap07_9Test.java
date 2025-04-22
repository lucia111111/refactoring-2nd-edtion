package com.refactoring.chap07.chap07_9;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class chap07_9Test {

    @Test
    void before_test(){
        // given
        List<String> people = List.of("Don", "John", "Kent");

        // when, then
        assertEquals("Don", Before.foundPerson(List.of("Alex", "Don", "Kent")));
        assertEquals("John", Before.foundPerson(List.of("Jane", "John", "Don")));
        assertEquals("", Before.foundPerson(List.of("Alex", "Bob")));
    }

    @Test
    void after_test(){
        // given
        List<String> people = List.of("Don", "John", "Kent");

        // when, then
        assertEquals("Don", After.foundPerson(List.of("Alex", "Don", "Kent")));
        assertEquals("John", After.foundPerson(List.of("Jane", "John", "Don")));
        assertEquals("", After.foundPerson(List.of("Alex", "Bob")));
    }
}