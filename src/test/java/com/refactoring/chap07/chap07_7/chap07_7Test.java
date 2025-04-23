package com.refactoring.chap07.chap07_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class chap07_7Test {

    @Test
    void before_test(){
        Before_Person beforePerson = new Before_Person("lucia");
        Department beforeDepartment = new Department();
        beforeDepartment.setChargeCode(999);
        beforeDepartment.setManager("aManager");
        beforePerson.setDepartment(beforeDepartment);

        assertTrue(beforePerson.getDepartment().getChargeCode() == 999);

        // Person -> Department -> Manager
        assertTrue(beforePerson.getDepartment().getManager().equals("aManager"));
    }

    @Test
    void after_test(){
        After_Person afterPerson = new After_Person("lucia");
        Department afterDepartment = new Department();
        afterDepartment.setChargeCode(999);
        afterDepartment.setManager("aManager");
        afterPerson.setDepartment(afterDepartment);

        assertTrue(afterPerson.getDepartment().getChargeCode() == 999);

        // 클라이언트는 Department 구조를 몰라도 됨
        assertTrue(afterPerson.getManager().equals("aManager"));
    }

}