package com.kaltrina.models;

public class Course {
    private int id;
    private String name;
    private String description;
    private int creditHours;
    private Semester semester;

    // Default constructor
    public Course() {
    }

    // Parameterized constructor
    public Course(int id, String name, String description, int creditHours, Semester semester) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.creditHours = creditHours;
        this.semester = semester;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course Details:\n");
        sb.append("  ID: ").append(id).append("\n");
        sb.append("  Name: ").append(name).append("\n");
        sb.append("  Description: ").append(description).append("\n");
        sb.append("  Credit Hours: ").append(creditHours).append("\n");
        sb.append("  Semester: ").append(semester != null ? semester.getName() : "Not assigned").append("\n");

        return sb.toString();
    }
}