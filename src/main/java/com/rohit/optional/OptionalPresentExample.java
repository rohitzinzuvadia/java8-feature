package com.rohit.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("hello_present");

        if(optional.isPresent()){
            System.out.println(optional.get());
        }

        optional.ifPresent(s-> System.out.println(s.toUpperCase()));
    }
}
