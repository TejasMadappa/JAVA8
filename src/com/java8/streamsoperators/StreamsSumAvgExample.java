package com.java8.streamsoperators;

import com.java8.testdata.Student;
import com.java8.testdata.StudentAPI;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {
    public static void main(String[] args) {
        System.out.println(summing());
        System.out.println(average());
    }

    private static int summing(){
        return StudentAPI.getStudents().stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }


    private static double average(){
        return StudentAPI.getStudents().stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }
}
