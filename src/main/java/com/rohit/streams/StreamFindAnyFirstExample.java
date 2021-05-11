package com.rohit.streams;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.Optional;

public class StreamFindAnyFirstExample {

    public static Optional<Student> findAny(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >=3.9 )
                .findAny();
    }

    public static Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >=3.5 )
                .findFirst();
    }
    public static void main(String[] args) {
        System.out.println("Find Any Result : " + findAny());
        System.out.println("Find First Result : " + findFirst());

    }
}
