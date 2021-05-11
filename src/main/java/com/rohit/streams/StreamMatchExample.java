package com.rohit.streams;

import com.rohit.data.StudentDataBase;

public class StreamMatchExample {
    public static boolean allMatch(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() >=3.5);
    }
    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() >=4.1);
    }

    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa() >=3.5);
    }
    public static void main(String[] args) {
        //System.out.println("Result of allMatch :  " + allMatch());
        //System.out.println("Result of anyMatch :  " + anyMatch());
        System.out.println("Result of noneMatch :  " + noneMatch());

    }
}
