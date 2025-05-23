package com.refactoring.chap07.chap07_1;

/**
 * 캡슐화
 *
 * 데이터 무결성 유지, 유지보수 용이
 *
 * */
public class Organization_After {
    private String name;
    private String country;

    public Organization_After(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static void main(String[] args) {
        Organization_After organization = new Organization_After("애크미 구스베리","GB");
        System.out.println("name :: " + organization.getName());

        organization.setName("마틴 파울러");
        System.out.println("new name :: " + organization.getName());
    }
}
