package com.java8.streams;

import com.java8.testdata.Student;
import com.java8.testdata.StudentAPI;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {
    public static void main(String[] args) {
        System.out.println(getStudentNames());
        System.out.println(getStudentNamesSet());
    }

    private static List<String> getStudentNames(){
        List<String> names = StudentAPI.getStudents().stream()
                .map(Student::getName).collect(Collectors.toList());

        return names;
    }

    private static Set<String> getStudentNamesSet(){
        Set<String> names = StudentAPI.getStudents().stream()
                .map(Student::getName).collect(Collectors.toSet());

        return names;
    }
}
