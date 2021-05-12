package com.rohit.streams_terminal;

import com.rohit.data.Student;
import com.rohit.data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAvgExample {
    public static int countTotalNotebooks(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNoteBooks));
    }
    public static double average(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNoteBooks));
    }
    public static void main(String[] args) {
        System.out.println("Total No.of notebooks : " + countTotalNotebooks());
        System.out.println("Average : " + average());
    }
}
