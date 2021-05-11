package com.rohit.streams;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {
    public static List<Student> filterStudents(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println("Filter Students Whose Gender is Female :  " + filterStudents());

    }
}
