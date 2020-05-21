package com.java8.methodreference;

import com.java8.testdata.Student;
import com.java8.testdata.StudentAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    /*
     * classname::methodname
     */
    static Consumer<String> consumer = System.out::println;
    static Consumer<Student> consumer1 = Student::printGrade;

    public static void main(String[] args) {
        StudentAPI.getStudents().forEach(consumer1);
    }
}
