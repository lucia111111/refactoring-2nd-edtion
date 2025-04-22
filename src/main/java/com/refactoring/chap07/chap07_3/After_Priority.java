package com.refactoring.chap07.chap07_3;

import java.util.List;

public class After_Priority {
    protected String value;

    public After_Priority(String value) {
        this.value = value;
    }

    public boolean isHighOrRush() {
        return "high".equals(value) || "rush".equals(value);
    }
}