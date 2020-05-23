package com.java8.streams;

import com.java8.testdata.Student;
import com.java8.testdata.StudentAPI;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        System.out.println(getStudentActivities());
        System.out.println(getStudentActivitiesUsingFlatMap());
        System.out.println(testCountDistinctAndSortFunctions());
    }

    private static List<List<String>> getStudentActivities(){
        List<List<String>> names = StudentAPI.getStudents().stream()
                .map(Student::getActivities).collect(Collectors.toList());

        return names;
    }

    private static List<String> getStudentActivitiesUsingFlatMap(){
        List<String> names = StudentAPI.getStudents().stream()
                .map(Student::getActivities).flatMap(List::stream).collect(Collectors.toList());

        return names;
    }

    private static List<String> testCountDistinctAndSortFunctions(){
        List<String> names = StudentAPI.getStudents().stream()
                .map(Student::getActivities).flatMap(List::stream)
                .distinct()
                .sorted()
                //.count() this will return count.
                .collect(Collectors.toList());

        return names;
    }
}
