package com.rohit.streams_terminal;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

    public static void groupStudentsByGender(){
        Map<String, List<Student>> genderMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(genderMap);
    }

    public static void customizeGrouping(){
        Map<String, List<Student>> genderMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student->student.getGpa() >=3.8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(genderMap);
    }

    public static void groupingStudentByGradeAndGPA(){
        Map<Integer, Map<String, List<Student>>> gradeWiseGPA = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
        System.out.println(gradeWiseGPA);
    }

    public static void groupingNotebooksAsPerStudent(){
        Map<String, Integer> notebooksPerStudent = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, summingInt(Student::getNoteBooks)));
        System.out.println(notebooksPerStudent);
    }
    public static void threeArgGroupBy(){
        LinkedHashMap<String, Set<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
        System.out.println(studentMap);
    }

    public static  void getMaxGPAStudentGradeWise(){
        Map<Integer, Optional<Student>> studentGradeMaxMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentGradeMaxMap);
    }

    public static  void getMinGPAStudentGradeWise(){
        Map<Integer, Optional<Student>> studentGradeMinMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, minBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentGradeMinMap);
    }

    public static void main(String[] args) {
        //groupStudentsByGender();
        //customizeGrouping();
        //groupingStudentByGradeAndGPA();
        //groupingNotebooksAsPerStudent();
        //threeArgGroupBy();
        getMaxGPAStudentGradeWise();

    }
}
