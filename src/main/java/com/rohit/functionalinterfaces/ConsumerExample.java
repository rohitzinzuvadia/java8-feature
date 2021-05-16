package com.rohit.functionalinterfaces;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> studentConsumer = (student)-> System.out.println(student);
    static Consumer<Student> nameConsumer = (student)-> System.out.println(student.getName());
    static Consumer<Student> activitiesConsumer = (student)-> System.out.println(student.getActivities());

    public static void printStudent(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer);
    }

    public static void printNameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(nameConsumer.andThen(activitiesConsumer));
    }

    public static void main(String[] args) {
        //Consumer<String> c1 = (s)-> System.out.println(s.toUpperCase());
        //c1.accept("java8");
        //printStudent();
        printNameAndActivities();
    }
}
