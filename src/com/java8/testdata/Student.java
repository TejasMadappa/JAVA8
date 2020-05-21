package com.java8.testdata;

import java.util.List;

public class Student {
    private long id;
    private String name;
    private String grade;
    private List<String> activities;

    public Student(long id, String name, String grade, List<String> activities){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.activities = activities;
    }

    public Student()
    {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public List<String> getActivities(){
        return activities;
    }

    public void printGrade()
    {
        System.out.println(grade);
    }
}
