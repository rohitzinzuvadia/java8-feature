package com.rohit.dates;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {

    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.of(7, 20);
        LocalTime localTime2 = LocalTime.of(8,20);
        long hours = Duration.between(localTime1, localTime2).toHours();
        System.out.println("Hour : " + hours);

    }
}
