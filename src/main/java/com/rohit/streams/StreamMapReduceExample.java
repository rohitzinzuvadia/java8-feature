package com.rohit.streams;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

public class StreamMapReduceExample {

    public static int noOfNotebooks(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() > 3)
                .map(Student::getNoteBooks)
                .reduce(0,(a,b)->a+b);
    }
    public static void main(String[] args) {
        System.out.println("No.of notebooks for students are : " + noOfNotebooks());
    }
}
