package com.rohit.dates;

import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {

        // create local time
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime : " + localTime);

        LocalTime localTime1 = LocalTime.of(22, 30);
        System.out.println("localTime1 : " + localTime1);

        LocalTime localTime2 = LocalTime.of(22, 30,25);
        System.out.println("localTime2 : " + localTime2);

        // getting the values from local time
        System.out.println("Get Hour : " + localTime.getHour());

        // modify values in local time
        System.out.println("Minus hour : " + localTime.minusHours(2L));
    }
}
