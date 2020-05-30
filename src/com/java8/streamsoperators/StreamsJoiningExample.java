package com.java8.streamsoperators;

import com.java8.testdata.Student;
import com.java8.testdata.StudentAPI;

import java.util.stream.Collectors;

public class StreamsJoiningExample {
    public static void main(String[] args) {
        System.out.println(joining1());
        System.out.println(joining2());
        System.out.println(joining3());
    }

    private static String joining1(){
        return StudentAPI.getStudents().stream().map(Student::getName).collect(Collectors.joining());
    }

    private static String joining2(){
        return StudentAPI.getStudents().stream()
                .map(Student::getName).collect(Collectors.joining("-"));
    }

    private static String joining3(){
        return StudentAPI.getStudents().stream()
                .map(Student::getName).collect(Collectors.joining("-","{","}"));
    }
}
