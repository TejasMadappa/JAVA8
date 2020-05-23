package com.java8.streams;

import com.java8.testdata.Student;
import com.java8.testdata.StudentAPI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StremasComparatorExample {
    public static void main(String[] args) {
        getStudentSortedByNames().forEach(System.out::println);
        getStudentSortedById().forEach(System.out::println);
    }

    private static List<Student> getStudentSortedByNames(){
        return StudentAPI.getStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    private static List<Student> getStudentSortedById(){
        return StudentAPI.getStudents().stream()
                .sorted(Comparator.comparing(Student::getId)/*.reversed()*/) //that will reverse the order
                .collect(Collectors.toList());
    }
}
