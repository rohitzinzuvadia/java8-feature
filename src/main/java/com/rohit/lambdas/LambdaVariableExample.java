package com.rohit.lambdas;

import java.util.function.Consumer;

public class LambdaVariableExample {
    public static void main(String[] args) {
        int i = 0;
        Consumer<Integer> c1 = (j)->{
            System.out.println("Value of I : " + j);
        };
    }
}
