package com.rohit.dates;

import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant1 = Instant.now();
        System.out.println("Instant : " + instant1);
        System.out.println("Instant in second : " + instant1.getEpochSecond());
        System.out.println("Instant : " + Instant.ofEpochSecond(0));
    }
}
