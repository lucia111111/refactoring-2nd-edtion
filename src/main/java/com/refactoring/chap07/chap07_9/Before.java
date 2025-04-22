package com.refactoring.chap07.chap07_9;

import java.util.List;

public class Before {
    public static String foundPerson(List<String> people) {
        for (String person : people) {
            if (person.equals("Don")) {
                return "Don";
            }
            if (person.equals("John")) {
                return "John";
            }
            if (person.equals("Kent")) {
                return "Kent";
            }
        }
        return "";
    }
}
