package com.refactoring.chap07.chap07_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class chap07_7Test {

    @Test
    void before_test(){
        Before_Person beforePerson = new Before_Person("lucia");
        Before_Department beforeDepartment = new Before_Department();
        beforeDepartment.setChargeCode(999);
        beforeDepartment.setManager("aManager");
        beforePerson.setDepartment(beforeDepartment);

        assertTrue(beforePerson.getDepartment().getChargeCode() == 999);
        assertTrue(beforePerson.getDepartment().getManager().equals("aManager"));
    }

    @Test
    void after_test(){
        After_Person afterPerson = new After_Person("lucia");
        After_Department afterDepartment = new After_Department();
        afterDepartment.setChargeCode(999);
        afterDepartment.setManager("aManager");
        afterPerson.setDepartment(afterDepartment);

        assertTrue(afterPerson.getDepartment().getChargeCode() == 999);
        assertTrue(afterPerson.getManager().equals("aManager"));
    }

}