package com.rohit.functionalinterfaces;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name,activities)->{
            System.out.println("Name : " + name + " Activities:  " + activities);
        };
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
    }
    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (a,b)->{
            System.out.println("a :" + a + " b : " + b);
        };

        biConsumer.accept("Hello","World");

        BiConsumer<Integer,Integer> multiply = (x,y)->{
            System.out.println("Multiplication : " +(x*y));
        };
        multiply.accept(3,4);
        nameAndActivities();
    }


}
