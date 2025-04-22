package com.refactoring.chap07.chap07_5;

/**
 * 메서드와 데이터가 너무 많은 클래스는 이해하기 쉽지 않으니 적절히 분리하는게 좋음 → 제거해도 다른 필드나 메서드들이 논리적으로 문제가 없을 경우만!
 * 일부 데이터와 메서드를 따로 묶을 수 있다면 분리
 * 함께 변경되는 일이 많거나 서로 의존하는 데이터도 분리
 * */
public class Before_Person {
    protected String name;
    protected String officeAreaCode;
    protected String officeNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}