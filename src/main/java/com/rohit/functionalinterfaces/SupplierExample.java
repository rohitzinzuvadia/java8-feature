package com.rohit.functionalinterfaces;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = ()->{
            return  new Student("Dany",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"),11);
        };
        //System.out.println(studentSupplier.get());

        Supplier<List<Student>> students = ()->{
            return StudentDataBase.getAllStudents();
        };

        System.out.println(students.get());

    }
}
