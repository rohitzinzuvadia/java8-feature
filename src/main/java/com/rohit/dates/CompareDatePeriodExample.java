package com.rohit.dates;

import java.time.LocalDate;
import java.time.Period;

public class CompareDatePeriodExample {

    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2020, 01, 01);
        LocalDate localDate2 = LocalDate.of(2020, 12, 31);

        Period period = localDate1.until(localDate2);
        System.out.println("Days : " + period.getDays());
        System.out.println("Months : " + period.getMonths());

    }
}
