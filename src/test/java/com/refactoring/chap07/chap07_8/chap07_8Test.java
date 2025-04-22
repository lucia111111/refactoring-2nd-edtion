package com.refactoring.chap07.chap07_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class chap07_8Test {
    @Test
    void before_test(){
        Before_Person beforePerson = new Before_Person("lucia");
        Department beforeDepartment = new Department();
        beforeDepartment.setChargeCode(999);
        beforeDepartment.setManager("aManager");
        beforePerson.setDepartment(beforeDepartment);

        assertTrue(beforePerson.getManager().equals("aManager"));
    }

    @Test
    void after_test(){
        After_Person afterPerson = new After_Person("lucia");
        Department afterDepartment = new Department();
        afterDepartment.setChargeCode(999);
        afterDepartment.setManager("aManager");
        afterPerson.setDepartment(afterDepartment);

        assertTrue(afterPerson.getDepartment().getManager().equals("aManager"));
    }
}