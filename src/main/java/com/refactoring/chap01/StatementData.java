package com.refactoring.chap01;

import java.util.List;
import java.util.Map;

public class StatementData {
    private Invoice invoice;
    private Map<String, Play> plays;

    public StatementData(Invoice invoice, Map<String, Play> plays) {
        this.invoice = invoice;
        this.plays = plays;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Map<String, Play> getPlays() {
        return plays;
    }

    public void setPlays(Map<String, Play> plays) {
        this.plays = plays;
    }

    public String getCustomer() {
        return invoice.getCustomer();
    }

    public List<Performance> getPerformances() {
        return invoice.getPerformances();
    }

    public Play playFor(Performance perf) {
        return plays.get(perf.getPlayId());
    }

    public int amountFor(Performance perf) {
        int thisAmount;
        switch (playFor(perf).getType()) {
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
                throw new IllegalArgumentException("알 수 없는 장르: " + playFor(perf).getType());
        }
        // 함수 안에서 값이 바뀌는 변수 반환
        return thisAmount;
    }

    public int totalAmount() {
        var result = 0;
        for (var perf : getPerformances()) {
            result += amountFor(perf);
        }
        return result;
    }

    public int volumeCreditsFor(Performance perf) {
        // 포인트를 적립한다.
        int result = Math.max(perf.getAudience() - 30, 0);
        // 희극 관객 5명마다 추가 포인트를 제공한다.
        if ("comedy".equals(playFor(perf).getType())) {
            result += Math.floor(perf.getAudience() / 5);
        }
        return result;
    }

    public int totalVolumeCredits() {
        var result = 0;
        for (var perf : getPerformances()) {
            result += volumeCreditsFor(perf);
        }
        return result;
    }
}
