package com.refactoring.chap07.chap07_7;

/**
 * 서버 객체의 필드가 가리키는 객체(위임 객체)의 메서드를 호출하려면
 *  - 클라이언트는 이 위임 객체를 알아야 함
 *  - 위임 객체의 인터페이스가 바뀌면 이 인터페이스를 사용하는 모든 클라이언트가 코드를 수정해야 함
 *  - 이러한 의존성을 없애려면 서버 자체에 위임 메서드를 만들어서 위임 객체의 존재를 숨김
 *  - 위임 객체가 수정되더라도 서버 코드만 고치면 되고, 클라이언트는 아무런 영향을 받지 않음
 * */
public class Department {
    protected int chargeCode;
    protected String manager;

    public int getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(int chargeCode) {
        this.chargeCode = chargeCode;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}