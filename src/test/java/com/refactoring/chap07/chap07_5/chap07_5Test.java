package com.refactoring.chap07.chap07_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class chap07_5Test {

    @Test
    void test(){
        // given
        Before_Person beforePerson = new Before_Person();
        beforePerson.setName("lucia");
        beforePerson.setOfficeAreaCode("02");
        beforePerson.setOfficeNumber("12345678");

        After_Person afterPerson = new After_Person("lucia","02","12345678");

        // when, then
        Assertions.assertTrue(beforePerson.getName().equals(afterPerson.getName()));
        Assertions.assertTrue(beforePerson.getOfficeAreaCode().equals(afterPerson.getOfficeAreaCode()));
        Assertions.assertTrue(beforePerson.getOfficeNumber().equals(afterPerson.getOfficeNumber()));

    }
}