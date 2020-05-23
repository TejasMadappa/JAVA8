package com.java8.streams;

import com.java8.testdata.Student;
import com.java8.testdata.StudentAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {
    public static void main(String[] args) {
       getStudentsWithGradeA().forEach(System.out::println);
    }

    static List<Student> getStudentsWithGradeA(){
        return StudentAPI.getStudents().stream()
                .filter((s) -> s.getGrade().equals("A"))
                .collect(Collectors.toList());
    }
}
