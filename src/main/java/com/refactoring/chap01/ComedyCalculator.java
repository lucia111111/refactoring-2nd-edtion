package com.refactoring.chap01;

public class ComedyCalculator extends PerformanceCalculator {
    public ComedyCalculator(Performance performance, Play play) {
        super(performance, play);
    }

    @Override
    public int amountFor() {
        int thisAmount = 30000;
        if (performance.getAudience() > 20) {
            thisAmount += 10000 + 500 * (performance.getAudience() - 20);
        }
        thisAmount += 300 * performance.getAudience();
        return thisAmount;
    }

    @Override
    public int volumeCreditsFor() {
        // 포인트를 적립한다.
        int result = Math.max(performance.getAudience() - 30, 0);
        // 희극 관객 5명마다 추가 포인트를 제공한다.
        result += Math.floor(performance.getAudience() / 5);
        return result;
    }
}
