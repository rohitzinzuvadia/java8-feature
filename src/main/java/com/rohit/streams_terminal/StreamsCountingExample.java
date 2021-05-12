package com.rohit.streams_terminal;

import com.rohit.data.StudentDataBase;

import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {
    public static long count(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .collect(counting());
    }
    public static void main(String[] args) {
        System.out.printf("Total No.of Students : " + count());
    }
}
