package com.refactoring.chap07.chap07_1;

/**
 * 캡슐화 전 -> 단순 POJO 객체
 *
 * 어디서든 필드값 직접 변경 가능
 * 캡슐화가 안 돼 있어서 객체의 일관성, 무결성 보장이 안 됨
 *
 * */
public class Organization_Before {
    public String name;
    public String country;
}
