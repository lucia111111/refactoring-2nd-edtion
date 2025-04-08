package com.refactoring.chap01;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

public class Statement {

    public String statement(Invoice invoice, Map<String, Play> plays) {
        var totalAmount = 0;
        var volumeCredits = 0;
        var result = new StringBuilder("청구 내역 (고객명: " + invoice.getCustomer() + ")\n");
        final NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);

        for (var perf : invoice.getPerformances()) {
            final Play play = plays.get(perf.getPlayId());
            var thisAmount = amountFor(perf, play);

            // 포인트를 적립한다.
            volumeCredits += Math.max(perf.getAudience() - 30, 0);
            // 희극 관객 5명마다 추가 포인트를 제공한다.
            if ("comedy".equals(play.getType())) {
                volumeCredits += Math.floor(perf.getAudience() / 5);
            }

            // 청구 내역을 출력한다.
            result.append(
                    String.format(
                            "  %s: %s원 (%d석)\n",
                            play.getName(),
                            format.format(thisAmount / 100.0),
                            perf.getAudience()
                    )
            );
            totalAmount += thisAmount;
        }

        result.append(String.format("총액: %s원\n", format.format(totalAmount / 100.0)));
        result.append(String.format("적립 포인트: %d점\n", volumeCredits));

        return result.toString();
    }

    // 값이 변하지 않는 변수는 매개변수로 전달
    private int amountFor(Performance perf, Play play) {
        int result;
        switch (play.getType()) {
            case "tragedy":
                result = 40000;
                if (perf.getAudience() > 30) {
                    result += 1000 * (perf.getAudience() - 30);
                }
                break;
            case "comedy":
                result = 30000;
                if (perf.getAudience() > 20) {
                    result += 10000 + 500 * (perf.getAudience() - 20);
                }
                result += 300 * perf.getAudience();
                break;
            default:
                throw new IllegalArgumentException("알 수 없는 장르: " + play.getType());
        }
        // 함수 안에서 값이 바뀌는 변수 반환
        return result;
    }
}