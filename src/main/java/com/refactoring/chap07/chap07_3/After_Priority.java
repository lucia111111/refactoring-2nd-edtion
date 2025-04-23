package com.refactoring.chap07.chap07_3;

/**
 * 우선순위 관련 로직을 After_Priority 객체로 캡슐화해서
 * 우선순위와 관련된 로직은 이 객체 안에서만 처리하도록
 *
 * 우선순위 값이 변경되거나 추가되도 이 객체만 수정하면 됨 -> 유연성
 * */
public class After_Priority {
    protected String value;

    public After_Priority(String value) {
        this.value = value;
    }

    // 우선순위 관리
    public boolean isHighOrRush() {
        return "high".equals(value) || "rush".equals(value);
    }
}