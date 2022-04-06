package org.example;

public class College {
    private String college_name;
    private String subject;
    private Teacher t;

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher getT() {
        return t;
    }

    public void setT(Teacher t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "College{" +
                "college_name='" + college_name + '\'' +
                ", subject='" + subject + '\'' +
                "\n t=" + t +
                '}';
    }
}
