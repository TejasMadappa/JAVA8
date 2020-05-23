package com.java8.streams;

import com.java8.testdata.Student;
import com.java8.testdata.StudentAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

//        Optional<Integer> result = getResult(numbers);
//        System.out.println(result.get());

        System.out.println(getResult(numbers));

        System.out.println(getStudentWithHighestId().get());

    }

    private static Integer getResult(List<Integer> numbers){
        return numbers.stream().reduce(2, (a, b) -> a*b);
    }

    private static Optional<Student> getStudentWithHighestId(){
        return StudentAPI.getStudents().stream().reduce((s1, s2) -> s1.getId() > s2.getId() ? s1 : s2);
    }
}
