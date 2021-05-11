package com.rohit.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        // converting localdate,localtime to localdatetime and viceversa
        LocalDate localDate = LocalDate.of(2021, 03, 03);
        LocalDateTime localDateTime = localDate.atTime(LocalTime.of(10, 10));
        System.out.println("localDateTime : " + localDateTime);

        LocalTime localTime = LocalTime.of(17, 39);
        LocalDateTime localDateTime1 = localTime.atDate(LocalDate.now());
        System.out.println("localDateTime1 : " + localDateTime1);

        System.out.println("Local Date : " + localDateTime1.toLocalDate());
        System.out.println("Local Time : " + localDateTime1.toLocalTime());
    }
}
