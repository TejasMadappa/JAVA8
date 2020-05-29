package com.java8.testdata;

import java.util.List;

public class Student {
    private long id;
    private String name;
    private String grade;
    private List<String> activities;
    private int noteBooks;

    public Student(long id, String name, String grade, List<String> activities, int noteBooks){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.activities = activities;
        this.noteBooks = noteBooks;
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

    public int getNoteBooks() {
        return noteBooks;
    }

    public void printGrade()
    {
        System.out.println(grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", activities=" + activities +
                ", noteBooks=" + noteBooks +
                '}';
    }
}
