package com.java8.streams;

import com.java8.testdata.Student;
import com.java8.testdata.StudentAPI;

import java.util.stream.Stream;

public class StreamsMapReduceExample {

    public static void main(String[] args) {
        System.out.println(getNumberOfBooks());
    }

    private static int getNumberOfBooks(){
        int books = StudentAPI.getStudents().stream()
                .filter((s) -> s.getGrade().equals("A"))
                .map(Student::getNoteBooks)
                .reduce(0, (a, b) -> a+b);

        return books;
    }
}
