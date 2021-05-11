package com.rohit.optional;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    public static String optionalOrElse(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }

    public static String optionalOrElseGet(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseGet(()->"Default");
        return name;
    }

    public static String optionalOrElseThrow(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseThrow(()-> new RuntimeException("No Data found"));
        return name;
    }

    public static void main(String[] args) {
        //System.out.println("optionalOrElse : " + optionalOrElse());
        //System.out.println("optionalOrElseGet : " + optionalOrElseGet());
        System.out.println("optionalOrElseThrow : " + optionalOrElseThrow());
    }
}
