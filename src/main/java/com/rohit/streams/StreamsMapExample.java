package com.rohit.streams;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static void findDistinctNumbers(){
        List<Integer> numbers = Arrays.asList(2,7,4,2,7,5,8,4,3,5);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        distinctNumbers.forEach(i-> System.out.println(i));

    }

    public static List<String> nameList(){
        List<String> names = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        return names;

    }
    public static void main(String[] args) {
        /*List<String> nameList = nameList();
        nameList.forEach(s-> System.out.println(s));*/
        findDistinctNumbers();

    }
}
