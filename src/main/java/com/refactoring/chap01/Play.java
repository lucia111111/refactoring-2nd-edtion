package com.refactoring.chap01;

public class Play {
    private String name;
    private String type;

    public Play(){}

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
