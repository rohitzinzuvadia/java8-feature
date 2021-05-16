package com.rohit.functionalinterfaces;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    static Predicate<Student> studentPredicate = (student -> student.getGpa()>=3.8);
    static BiFunction<List<Student>,Predicate<Student>, Map<String,Double>> biFunction = ((students, studentPredicate1) -> {
        Map<String,Double> stringDoubleMap = new HashMap<>();
        students.forEach(student -> {
            if(studentPredicate.test(student)){
                stringDoubleMap.put(student.getName(),student.getGpa());
            }
        });
        return stringDoubleMap;
    });


    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),studentPredicate));

    }
}
