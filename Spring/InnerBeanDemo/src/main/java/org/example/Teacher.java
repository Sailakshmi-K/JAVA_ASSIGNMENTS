package org.example;

public class Teacher {
    private String tname;
    private String qualification;
    private String date_of_joining;

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getDate_of_joining() {
        return date_of_joining;
    }

    public void setDate_of_joining(String date_of_joining) {
        this.date_of_joining = date_of_joining;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tname='" + tname + '\'' +
                ", qualification='" + qualification + '\'' +
                ", date_of_joining='" + date_of_joining + '\'' +
                '}';
    }
}
