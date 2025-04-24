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

        // 객체 내부의 다른 객체(Department)에 접근해야 하는 경우,
        // 외부에서 직접 Department에 접근하지 않도록 Person 중간에서 대신 처리해주는 메서드 제공
        // 위임 객체에 대한 의존성을 숨겨서 느슨한 결합 구조를 만들도록
        // 클라이언트는 Department 구조를 몰라도 됨
        assertTrue(afterPerson.getManager().equals("aManager"));
    }

}