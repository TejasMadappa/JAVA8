package com.java8.streams;

import com.java8.testdata.Student;
import com.java8.testdata.StudentAPI;

public class StreamsMatchExample {
    public static void main(String[] args) {
        System.out.println("All students are having grade A "+allMatch());
        System.out.println("None of the students are having grade A "+noneMatch());
        System.out.println("Any student having grade A "+anyMatch());
    }

    private static boolean allMatch(){
        return StudentAPI.getStudents().stream()
                .allMatch((s) -> s.getGrade().equals("A"));
    }

    private static boolean noneMatch(){
        return StudentAPI.getStudents().stream()
                .noneMatch((s) -> s.getGrade().equals("A"));
    }

    private static boolean anyMatch(){
        return StudentAPI.getStudents().stream()
                .anyMatch((s) -> s.getGrade().equals("A"));
    }
}
