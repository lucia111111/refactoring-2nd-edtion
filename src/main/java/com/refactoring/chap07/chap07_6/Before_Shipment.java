package com.refactoring.chap07.chap07_6;

/**
 * 제 역할을 못해서 그대로 두면 안 되는 클래스를 인라인 → 역할을 옮기는 리팩토링을 하고나니 특정 클래스에 남는 역할이 거의 없는 경우 발생
 * 클래스를 인라인해서 복잡도를 줄이기
 * */
public class Before_Shipment {
    protected Before_TrackingInformation trackingInformation;
    
    public String trackingInfo() {
        return trackingInformation.display(); 
    }

    public Before_TrackingInformation getTrackingInformation() {
        return trackingInformation;
    }

    public void setTrackingInformation(Before_TrackingInformation trackingInformation) {
        this.trackingInformation = trackingInformation;
    }
}