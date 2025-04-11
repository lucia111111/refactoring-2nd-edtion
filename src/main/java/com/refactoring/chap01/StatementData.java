package com.refactoring.chap01;

import java.util.List;
import java.util.Map;

public class StatementData {
    private Invoice invoice;
    private Map<String, Play> plays;

    private PerformanceCalculator performanceCalculator;

    public StatementData(Invoice invoice, Map<String, Play> plays) {
        this.invoice = invoice;
        this.plays = plays;
        //this.performanceCalculator = new PerformanceCalculator(playFor);
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
        return new PerformanceCalculator(perf, playFor(perf)).amountFor();
    }

    public int totalAmount() {
        var result = 0;
        for (var perf : getPerformances()) {
            result += amountFor(perf);
        }
        return result;
    }

    public int volumeCreditsFor(Performance perf) {
        return new PerformanceCalculator(perf, playFor(perf)).volumeCreditsFor();
    }

    public int totalVolumeCredits() {
        var result = 0;
        for (var perf : getPerformances()) {
            result += volumeCreditsFor(perf);
        }
        return result;
    }
}
