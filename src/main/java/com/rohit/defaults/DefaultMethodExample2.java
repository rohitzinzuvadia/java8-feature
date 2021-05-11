package com.rohit.defaults;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {

    static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

    public static void sortByName(List<Student> students){
        students.sort(nameComparator);
        students.forEach(studentConsumer);
    }

    public static void sortByGPA(List<Student> students){
        Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
        students.sort(gpaComparator);
        students.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> students){
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        students.sort(studentComparator);
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> allStudents = StudentDataBase.getAllStudents();
        /*System.out.println("Before Sort");
        allStudents.forEach(studentConsumer);
        System.out.println("After Sort");
        sortByName(allStudents);
        System.out.println("Sort by GPA");
        sortByGPA(allStudents);*/

        sortWithNullValues(allStudents);

    }
}
