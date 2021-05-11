package com.rohit.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {
    public static Optional<Integer> limit(List<Integer> integers){
        return integers.stream()
                .limit(2)
                .reduce((x,y)->x+y);
    }
    public static Optional<Integer> skip(List<Integer> integers){
        return integers.stream()
                .skip(2)
                .reduce((x,y)->x+y);
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        System.out.println("Limit result : " + limit(integerList));
        System.out.println("Skip result : " + skip(integerList));
    }
}
