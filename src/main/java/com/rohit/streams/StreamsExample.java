package com.rohit.streams;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        Predicate<Student> studentPredicate = (student -> student.getGpa() >=3.8 );

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .filter(studentPredicate)
                .peek((student)->{
                    System.out.println(student);
                })
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMap);
    }
}
