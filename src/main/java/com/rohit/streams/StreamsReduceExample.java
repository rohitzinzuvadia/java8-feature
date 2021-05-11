package com.rohit.streams;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream()
                .reduce(1,(a,b)->a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b)->a*b);
    }

    public static Optional<Student> getHighestGPAStudent(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)-> s1.getGpa()>s2.getGpa() ? s1 : s2);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7);
        System.out.println("performMultiplication : " + performMultiplication(integers));
        System.out.println("Highest Grade GPA student is : ");
        Optional<Student> highestGPAStudent = getHighestGPAStudent();
        if(highestGPAStudent.isPresent()){
            System.out.println(highestGPAStudent.get());
        }
    }
}
