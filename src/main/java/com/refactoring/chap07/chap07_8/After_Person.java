package com.refactoring.chap07.chap07_8;

/**
 클라이언트가 위임 객체의 또 다른 기능을 사용하고 싶을 때마다 서버에 위임 메서드를 추가해야하는 귀찮은 일이 생김
 서버 클래스는 그저 중개자(middle man) 역할로 전락하게 됨
 이런 경우, 차라리 클라이언트가 위임 객체를 직접 호출하는게 나음
 * */
public class After_Person {
    protected String name;
    protected Department department;

    public After_Person(String name) {
        this.name = name;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

//    public String manager() {
//        return department.getManager();
//    }

    public Department getDepartment(){
        return department;
    }
}