package com.java8.streamsoperators;

import com.java8.testdata.Student;
import com.java8.testdata.StudentAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGroupingbyExample {
    public static void main(String[] args) {
        groupingBy1();
        customizedGroupingBy1();
    }

    private static void groupingBy1(){
        Map<String, List<Student>> result = StudentAPI.getStudents().stream()
                .collect(Collectors.groupingBy(Student::getGrade));

        System.out.println(result);
    }

    private static void customizedGroupingBy1(){
        Map<String, List<Student>> result = StudentAPI.getStudents().stream()
                .collect(Collectors.groupingBy((s)->s.getGrade().equals("A") ? "EXCELLENT" : "AVERAGE"));

        System.out.println(result);
    }
}
