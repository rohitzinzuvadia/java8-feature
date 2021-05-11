package com.rohit.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsMaxMinExample {

    public static Optional<Integer> findMaxNumber(List<Integer> integers){
        return integers.stream().max(Comparator.comparing(Integer::intValue));
    }
    
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        System.out.println("Max number from List : " + findMaxNumber(integerList));
    }
}
