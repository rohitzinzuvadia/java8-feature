package com.rohit.streams_terminal;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamMinByAndMaxByExample {

    public static Optional<Student> studentMinGPA(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> studentMaxGPA(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println("Student has Min GPA : " + studentMinGPA());
        System.out.println("Student has Max GPA : " + studentMaxGPA());
    }
}
