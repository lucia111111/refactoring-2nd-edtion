package com.refactoring.chap06.chap06_10;

public class After {

    public void client01() throws Exception{
        Reading rawReading = acquireReading();
        Reading aReading = enrichReading(rawReading);
        double baseCharge = aReading.getBaseCharge();
    }

    public void client02() throws Exception{
        Reading rawReading = acquireReading();
        Reading aReading = enrichReading(rawReading);
        double taxableCharge = aReading.getTaxableCharge();
    }

    public void client03() throws Exception{
        Reading rawReading = acquireReading();
        Reading aReading = enrichReading(rawReading);
        double basicChargeAmount = aReading.getBaseCharge();
    }

    public Reading enrichReading(Reading reading) throws CloneNotSupportedException {
        Reading result = reading.clone();
        result.setBaseCharge(calculateBaseCharge(result));
        result.setTaxableCharge(Math.max(0, result.getBaseCharge() - taxThreshold(result.year)));
        return result;
    }

    public double calculateBaseCharge(Reading reading){
        return baseRate(reading.month, reading.year) * reading.quantity;
    }

    public Reading acquireReading(){
        return new Reading(new Customer("ivan"),10,5,2017);
    }

    public double baseRate(int month, int year) {
        return month * year;
    }

    public double taxThreshold(int year) {
        return year;
    }
}
