package com.kaltrina.models;

import java.util.Date;

public class Exam {
    private int id;
    private String name;
    private Course course;
    private Date examDate;
    private int maxPoints;

    // Default constructor
    public Exam() {
    }

    // Parameterized constructor
    public Exam(int id, String name, Course course, Date examDate, int maxPoints) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.examDate = examDate;
        this.maxPoints = maxPoints;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course.getName() +
                ", examDate=" + examDate +
                ", maxPoints=" + maxPoints +
                '}';
    }
}