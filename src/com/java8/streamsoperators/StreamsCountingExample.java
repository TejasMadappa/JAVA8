package com.java8.streamsoperators;

import com.java8.testdata.StudentAPI;

import java.util.stream.Collectors;

public class StreamsCountingExample {
    public static void main(String[] args) {
        System.out.println(counting());
    }

    private static long counting(){
        return StudentAPI.getStudents().stream()
                .filter((s)-> s.getGrade().equals("A"))
                .collect(Collectors.counting());
    }
}
