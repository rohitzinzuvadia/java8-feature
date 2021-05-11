package com.rohit.streams;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static List<String> getStudentActivities(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());


    }

    public static long getStudentActivitiesCount(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();

    }
    public static void main(String[] args) {
        System.out.println("GetStudentActivities : " +  getStudentActivities());
        System.out.println("GetStudentActivitiesCount : " + getStudentActivitiesCount());

    }
}
