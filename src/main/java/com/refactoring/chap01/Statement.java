package com.refactoring.chap01;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

public class Statement {

    public String statement(Invoice invoice, Map<String, Play> plays) {
        var totalAmount = 0;
        var volumeCredits = 0;
        var result = new StringBuilder("청구 내역 (고객명: " + invoice.getCustomer() + ")\n");

        for (var perf : invoice.getPerformances()) {
            // 청구 내역을 출력한다.
            result.append(
                    String.format(
                            "  %s: %s원 (%d석)\n",
                            playFor(plays, perf).getName(),
                            getNumberFormat().format(amountFor(perf, plays) / 100.0),
                            perf.getAudience()
                    )
            );
            totalAmount += amountFor(perf, plays);
        }

        for (var perf : invoice.getPerformances()) {
            volumeCredits += volumeCreditsFor(plays, perf);
        }

        result.append(String.format("총액: %s원\n", getNumberFormat().format(totalAmount / 100.0)));
        result.append(String.format("적립 포인트: %d점\n", volumeCredits));

        return result.toString();
    }

    private static NumberFormat getNumberFormat() {
        return NumberFormat.getCurrencyInstance(Locale.US);
    }

    private int volumeCreditsFor(Map<String, Play> plays, Performance perf) {
        // 포인트를 적립한다.
        int result = Math.max(perf.getAudience() - 30, 0);
        // 희극 관객 5명마다 추가 포인트를 제공한다.
        if ("comedy".equals(playFor(plays, perf).getType())) {
            result += Math.floor(perf.getAudience() / 5);
        }
        return result;
    }

    private Play playFor(Map<String, Play> plays, Performance perf) {
        return plays.get(perf.getPlayId());
    }

    // 값이 변하지 않는 변수는 매개변수로 전달
    private int amountFor(Performance perf, Map<String, Play> plays) {
        int thisAmount;
        switch (playFor(plays, perf).getType()) {
            case "tragedy":
                thisAmount = 40000;
                if (perf.getAudience() > 30) {
                    thisAmount += 1000 * (perf.getAudience() - 30);
                }
                break;
            case "comedy":
                thisAmount = 30000;
                if (perf.getAudience() > 20) {
                    thisAmount += 10000 + 500 * (perf.getAudience() - 20);
                }
                thisAmount += 300 * perf.getAudience();
                break;
            default:
                throw new IllegalArgumentException("알 수 없는 장르: " + playFor(plays, perf).getType());
        }
        // 함수 안에서 값이 바뀌는 변수 반환
        return thisAmount;
    }
}