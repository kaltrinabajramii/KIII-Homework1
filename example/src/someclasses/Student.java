package com.kaltrina.models;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String email;
    private List<Course> enrolledCourses;

    // Default constructor
    public Student() {
        this.enrolledCourses = new ArrayList<>();
    }

    // Parameterized constructor
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.enrolledCourses = new ArrayList<>();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    // Methods
    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
        }
    }

    public void withdrawFromCourse(Course course) {
        enrolledCourses.remove(course);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student Details:\n");
        sb.append("  ID: ").append(id).append("\n");
        sb.append("  Name: ").append(name).append("\n");
        sb.append("  Email: ").append(email).append("\n");
        sb.append("  Enrolled Courses: ");

        if (enrolledCourses.isEmpty()) {
            sb.append("None\n");
        } else {
            sb.append("\n");
            for (Course course : enrolledCourses) {
                sb.append("    - ").append(course.getName()).append("\n");
            }
        }

        return sb.toString();
    }
}