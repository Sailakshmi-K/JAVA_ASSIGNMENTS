package org.example;
//Class Student:sname,qualification,aggregate%
public class Student {
    private String sname;
    private String qualification;
    private float aggregate;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public float getAggregate() {
        return aggregate;
    }

    public void setAggregate(float aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", qualification='" + qualification + '\'' +
                ", aggregate=" + aggregate +
                '}';
    }
}
