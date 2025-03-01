package com.kaltrina.models;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int id;
    private String name;
    private String email;
    private String department;
    private String title;
    private List<Course> taughtCourses;

    // Default constructor
    public Professor() {
        this.taughtCourses = new ArrayList<>();
    }

    // Parameterized constructor
    public Professor(int id, String name, String email, String department, String title) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.title = title;
        this.taughtCourses = new ArrayList<>();
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Course> getTaughtCourses() {
        return taughtCourses;
    }

    public void setTaughtCourses(List<Course> taughtCourses) {
        this.taughtCourses = taughtCourses;
    }

    // Methods
    public void assignCourse(Course course) {
        if (!taughtCourses.contains(course)) {
            taughtCourses.add(course);
        }
    }

    public void removeCourse(Course course) {
        taughtCourses.remove(course);
    }

    public int getTeachingLoad() {
        int totalCreditHours = 0;
        for (Course course : taughtCourses) {
            totalCreditHours += course.getCreditHours();
        }
        return totalCreditHours;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Professor Details:\n");
        sb.append("  ID: ").append(id).append("\n");
        sb.append("  Name: ").append(name).append("\n");
        sb.append("  Email: ").append(email).append("\n");
        sb.append("  Department: ").append(department).append("\n");
        sb.append("  Title: ").append(title).append("\n");
        sb.append("  Taught Courses: ");

        if (taughtCourses.isEmpty()) {
            sb.append("None\n");
        } else {
            sb.append("\n");
            for (Course course : taughtCourses) {
                sb.append("    - ").append(course.getName()).append("\n");
            }
        }

        return sb.toString();
    }
}