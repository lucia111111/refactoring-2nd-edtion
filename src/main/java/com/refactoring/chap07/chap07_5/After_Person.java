package com.refactoring.chap07.chap07_5;


/**
 * Poerson이 TelephoneNumber객체에게 전화번호 관련 정보를 위임
 *  -> 역할 분산 -> 응집도 향상
 * */
public class After_Person {
    protected String name;
    protected After_TelephoneNumber telephoneNumber;

    public After_Person(String name, String areaCode, String number) {
        this.name = name;
        this.telephoneNumber = new After_TelephoneNumber(areaCode, number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficeAreaCode() {
        return telephoneNumber.getAreaCode();
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.telephoneNumber.setAreaCode(officeAreaCode);
    }

    public String getOfficeNumber() {
        return telephoneNumber.getNumber();
    }

    public void setOfficeNumber(String officeNumber) {
        this.telephoneNumber.setNumber(officeNumber);
    }
}