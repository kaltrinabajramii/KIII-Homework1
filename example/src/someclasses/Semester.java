package com.kaltrina.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Semester {
    private int id;
    private String name;
    private Date startDate;
    private Date endDate;
    private List<Course> courses;

    // Default constructor
    public Semester() {
        this.courses = new ArrayList<>();
    }

    // Parameterized constructor
    public Semester(int id, String name, Date startDate, Date endDate) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.courses = new ArrayList<>();
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    // Methods
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.setSemester(this);
        }
    }

    public void removeCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
            if (course.getSemester() == this) {
                course.setSemester(null);
            }
        }
    }

    public boolean isActive() {
        Date now = new Date();
        return now.after(startDate) && now.before(endDate);
    }

    @Override
    public String toString() {
        return "Semester{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}