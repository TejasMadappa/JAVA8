package com.java8.constructorreference;

import com.java8.testdata.Student;

import java.util.function.Supplier;

public class ConstructorReferenceExample {
    static Supplier<Student> studentSupplier = Student::new;

    public static void main (String[] args) {
        System.out.println(studentSupplier.get());
    }
}
