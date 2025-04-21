package com.refactoring.chap07.chap07_1;

/**
 * 가변 데이터를 저장하는 용도로 객체를 사용
 * 사용자는 무엇이 저장된 값이고 무엇이 계산된 값인지 알 필요가 없음
 * 레코드를 캡슐화하는 목적 → 변수 자체는 물론 그 내용을 조작하는 방식도 통제하기 위함
 * */

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
