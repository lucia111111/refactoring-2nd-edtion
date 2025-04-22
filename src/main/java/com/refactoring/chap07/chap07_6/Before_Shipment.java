package com.refactoring.chap07.chap07_6;

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