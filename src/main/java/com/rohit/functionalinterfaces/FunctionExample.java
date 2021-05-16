package com.rohit.functionalinterfaces;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample {

    static Function<List<Student>, Map<String,Double>> studentFunction = (students -> {
        Map<String,Double> stringDoubleMap = new HashMap<>();
        students.forEach(student -> {
            stringDoubleMap.put(student.getName(),student.getGpa());
        });
        return stringDoubleMap;
    });

    static Function<String,String> function1 = (s)->s.toUpperCase();
    static Function<String,String> function2 = (s)->s.toUpperCase().concat("Default");
    public static void main(String[] args) {
       // System.out.println(function1.apply("Rohit"));
        //System.out.println(function1.andThen(function2).apply("Rohit"));
        //System.out.println(function1.compose(function2).apply("Rohit"));
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
