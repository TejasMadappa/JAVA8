package com.java8.streams;

import com.java8.testdata.Student;
import com.java8.testdata.StudentAPI;

import java.util.Optional;

public class StreamsFindFirstOrAnyExample {
    public static void main(String[] args) {
        Optional<Student> result = testFindAny();
//        Optional<Student> result = testFindFirst();
        if(result.isPresent()){
            System.out.println("Result is "+result.get());
        }else{
            System.out.println("Found none");
        }
    }

    private static Optional<Student> testFindAny(){
        return StudentAPI.getStudents().stream()
                .filter((s)-> s.getGrade().equals("A"))
                .findAny();
    }

    private static Optional<Student> testFindFirst(){
        return StudentAPI.getStudents().stream()
                .filter((s)-> s.getGrade().equals("A"))
                .findAny();
    }
}
