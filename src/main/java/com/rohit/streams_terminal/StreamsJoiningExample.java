package com.rohit.streams_terminal;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    public static String joining_1(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining_2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("_"));
    }

    public static String joining_3(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","(",")"));
    }
    public static void main(String[] args) {
        System.out.println("Joining_1 result : " + joining_1());
        System.out.println("Joining_2 result : " + joining_2());
        System.out.println("Joining_3 result : " + joining_3());

    }
}
