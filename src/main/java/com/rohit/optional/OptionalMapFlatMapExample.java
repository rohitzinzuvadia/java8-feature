package com.rohit.optional;

import com.rohit.data.Bike;
import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    public static void optionalFilter(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        studentOptional
                .filter(student -> student.getGpa() >=3.5 )
                .ifPresent(student -> System.out.println(student));
    }

    public static void optionalMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> name = studentOptional
                .filter(student -> student.getGpa() >= 3.5)
                .map(Student::getName);
        System.out.println(name.get());
    }

    public static void optionalFlatMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> bikeName = studentOptional
                .filter(student -> student.getGpa() >= 3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);
        System.out.println(bikeName.get());

    }

    public static void main(String[] args) {
        //optionalFilter();
        //optionalMap();
        optionalFlatMap();
    }
}
