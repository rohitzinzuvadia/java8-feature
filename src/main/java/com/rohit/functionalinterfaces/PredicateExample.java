package com.rohit.functionalinterfaces;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> predicate1 = (i)-> i%2==0;
    static Predicate<Student> genderPredicate =
            (student)->student.getGender().equalsIgnoreCase("female");
    static Predicate<Student> gradePredicate =
            (student)->student.getGradeLevel()>=3;

    public static void getFemaleStudentInGrade3(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(genderPredicate.and(gradePredicate).test(student)){
                System.out.println(student);
            }
        });


    }

    public static void main(String[] args) {
        System.out.println(predicate1.test(10));
        getFemaleStudentInGrade3();
    }
}
