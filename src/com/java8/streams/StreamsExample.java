package com.java8.streams;

import com.java8.testdata.Student;
import com.java8.testdata.StudentAPI;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        Predicate<Student> predicate1 = (s) -> s.getGrade() == "A";
        Predicate<Student> predicate2 = (s) -> s.getName().startsWith("t");
        List<Student> students = StudentAPI.getStudents();

        Map<String, String> map =  students.stream().filter(predicate1)
                .filter(predicate2)
                .collect(Collectors.toMap(Student::getName, Student::getGrade));

        System.out.println(map);
    }
}

