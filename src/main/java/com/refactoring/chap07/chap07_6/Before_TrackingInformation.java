package com.refactoring.chap07.chap07_6;

/**
 * 제 역할을 못해서 그대로 두면 안 되는 클래스를 인라인 → 역할을 옮기는 리팩토링을 하고나니 특정 클래스에 남는 역할이 거의 없는 경우 발생
 * 클래스를 인라인해서 복잡도를 줄이기
 * */
public class Before_TrackingInformation {
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