package com.rohit.defaults;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Adam","Jenny","Alex","Dan","Mike","Eric");
        // prior to java 8
//        Collections.sort(names);
//        System.out.println("Sorted list using Collections.sort() : " + names);

        //using java 8
        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted list in natural : " + names);

        names.sort(Comparator.reverseOrder());
        System.out.println("Sorted list in reverse : " + names);
    }
}
