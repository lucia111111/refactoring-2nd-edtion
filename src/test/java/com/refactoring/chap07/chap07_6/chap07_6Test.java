package com.refactoring.chap07.chap07_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class chap07_6Test {

    @Test
    void before_test(){
        // given
        Before_TrackingInformation beforeInfo = new Before_TrackingInformation();
        beforeInfo.setShippingCompany("FedEx");
        beforeInfo.setTrackingNumber("123-456");
        Before_Shipment beforeShipment = new Before_Shipment();
        beforeShipment.setTrackingInformation(beforeInfo);

        // when, then
        assertEquals("FedEx", beforeShipment.getTrackingInformation().getShippingCompany());
        assertEquals("123-456", beforeShipment.getTrackingInformation().getTrackingNumber());
        assertEquals("FedEx : 123-456", beforeShipment.trackingInfo());
    }

    @Test
    void after_test(){
        // given
        After_Shipment afterShipment = new After_Shipment();
        afterShipment.setShippingCompany("FedEx");
        afterShipment.setTrackingNumber("123-456");

        // when, then
        assertEquals("FedEx", afterShipment.getShippingCompany());
        assertEquals("123-456", afterShipment.getTrackingNumber());
        assertEquals("FedEx : 123-456", afterShipment.display());
    }
}