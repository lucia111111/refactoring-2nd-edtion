package com.refactoring.chap07.chap07_9;

import java.util.List;

/**
 * 더 간단한 알고리즘이 있다면 기존 코드를 간명한 방식으로 고침
 * */
public class After {
    public static String foundPerson(List<String> people) {
        List<String> candidates = List.of("Don", "John", "Kent");
        return people.stream()
                .filter(candidates::contains)
                .findFirst()
                .orElse("");
    }
}
