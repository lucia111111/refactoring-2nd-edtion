package com.refactoring.chap01;

public abstract class PerformanceCalculator {
    protected Performance performance;
    protected Play play;

    public PerformanceCalculator(Performance performance, Play play) {
        this.performance = performance;
        this.play = play;
    }

    public abstract int amountFor();


    public abstract int volumeCreditsFor();
}
