package com.rohit.numericstreams;

import java.util.stream.IntStream;

public class NumericStreamExample {
    public static void main(String[] args) {
        System.out.println("count : "+IntStream.rangeClosed(1,50).count());
        System.out.println("sum : "+IntStream.rangeClosed(1,50).sum());
        System.out.println("Average : "+IntStream.rangeClosed(1,50).average());
        System.out.println("Max : "+IntStream.rangeClosed(1,50).max());
        System.out.println("Min : "+IntStream.rangeClosed(1,50).min());
    }
}
