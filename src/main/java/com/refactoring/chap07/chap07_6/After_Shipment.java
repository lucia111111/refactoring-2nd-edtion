package com.refactoring.chap07.chap07_6;

public class After_Shipment {
    protected String shippingCompany;
    protected String trackingNumber;

    public String display() {
        return String.format("%s : %s", shippingCompany, trackingNumber);
    }

    public String getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}