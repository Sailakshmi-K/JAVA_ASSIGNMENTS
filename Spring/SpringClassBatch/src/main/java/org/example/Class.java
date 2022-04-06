package org.example;

import java.util.List;

public class Class {
    private int batchcode;
    private String Coursename;
    private List<Object> Student;

    public int getBatchcode() {
        return batchcode;
    }

    public void setBatchcode(int batchcode) {
        this.batchcode = batchcode;
    }

    public String getCoursename() {
        return Coursename;
    }

    public void setCoursename(String coursename) {
        Coursename = coursename;
    }

    public List<Object> getStudent() {
        return Student;
    }

    public void setStudent(List<Object> student) {
        Student = student;
    }

    @Override
    public String toString() {
        return "Class{" +
                "batchcode=" + batchcode +
                ", Coursename='" + Coursename + '\'' +
                ", \nStudent=" + Student +
                '}';
    }
}
