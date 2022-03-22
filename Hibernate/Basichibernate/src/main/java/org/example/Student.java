package org.example;

public class Student {

    private int s_id,s_age;
    private String s_name,s_subject;

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public int getS_age() {
        return s_age;
    }

    public void setS_age(int s_age) {
        this.s_age = s_age;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_subject() {
        return s_subject;
    }

    public void setS_subject(String s_subject) {
        this.s_subject = s_subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", s_age=" + s_age +
                ", s_name='" + s_name + '\'' +
                ", s_subject='" + s_subject + '\'' +
                '}';
    }
}
