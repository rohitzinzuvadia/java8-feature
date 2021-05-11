package com.rohit.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;


public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2021, 05, 9);
        System.out.println("localDate : " + localDate);
        LocalDate localDate1 = LocalDate.ofYearDay(2021, 93);
        System.out.println("localDate1 : " + localDate1);

        System.out.println("Current Month : " + localDate.getMonth());

        System.out.println("LocalDateWithYear : " + localDate.withYear(2017));
        System.out.println("with Chronofield : " + localDate.with(ChronoField.YEAR,2019));

        System.out.println(localDate.with(TemporalAdjusters.firstDayOfMonth()));

        System.out.println("isLeapYear : " + localDate.plusYears(3L).isLeapYear());

        System.out.println(localDate.isSupported(ChronoUnit.DAYS));
    }
}
