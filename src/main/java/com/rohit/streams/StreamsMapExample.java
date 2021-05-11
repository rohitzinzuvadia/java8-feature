package com.rohit.streams;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> nameList(){
        List<String> names = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        return names;

    }
    public static void main(String[] args) {
        List<String> nameList = nameList();
        nameList.forEach(s-> System.out.println(s));

    }
}
