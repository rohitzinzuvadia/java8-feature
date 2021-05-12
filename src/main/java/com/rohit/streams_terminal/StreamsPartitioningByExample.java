package com.rohit.streams_terminal;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;

public class StreamsPartitioningByExample {
    public static void partitioningByGPA(){
        Predicate<Student> gpaPredicate = student -> student.getGpa() >=3.8;
        Map<Boolean, List<Student>> gpaMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate));
        System.out.println(gpaMap);
    }
    public static void main(String[] args) {
        partitioningByGPA();
    }
}
