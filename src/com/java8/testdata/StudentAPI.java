package com.java8.testdata;

import java.util.Arrays;
import java.util.List;

public class StudentAPI {

    private final static Student student1 = new Student(1, "tejas", "A" , Arrays.asList("swim", "cricket", "football"), 10);
    private final static Student student2 = new Student(2, "tbhoomi", "A", Arrays.asList("throwball", "cricket", "football"), 5);
    private final static Student student3 = new Student(3, "maddy", "C", Arrays.asList("shutle", "cricket", "football"), 4);
    private final static Student student4 = new Student(4, "daksh", "D", Arrays.asList("swim", "tennis", "cricket"), 8);

    public static List<Student> getStudents()
    {
        return Arrays.asList(student1, student2, student3, student4);
    }

    public void printStudentGrade()
    {
        getStudents().forEach(student -> {
            System.out.println(student.getGrade());
        });
    }
}
