package com.refactoring.chap06.chap06_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class chap06_8Test {

    @Test
    void test() throws Exception {
        // given
        Station station = new Station();
        station.setName("ZB1");
        List<Reading> readings = new ArrayList<>();
        readings.add(new Reading(47, LocalDateTime.of(2016,11,10,6,10)));
        readings.add(new Reading(53, LocalDateTime.of(2016,11,10,6,20)));
        readings.add(new Reading(58, LocalDateTime.of(2016,11,10,6,30)));
        readings.add(new Reading(53, LocalDateTime.of(2016,11,10,6,40)));
        readings.add(new Reading(51, LocalDateTime.of(2016,11,10,6,50)));
        station.setReadings(readings);

        // when
        Before before = new Before();
        List<Reading> beforeList = before.readingsOutsideRange(station, 40,60);
        After after = new After();
        List<Reading> afterList = after.readingsOutsideRange(station, 40,60);

        // then
        Assertions.assertEquals(beforeList, afterList);
    }


}