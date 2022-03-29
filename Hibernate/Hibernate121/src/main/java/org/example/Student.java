package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
    @Id
    private int sid;
    private String sname;
    @OneToOne
    private Laptop lappy;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Laptop getLappy() {
        return lappy;
    }

    public void setLappy(Laptop lappy) {
        this.lappy = lappy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", lappy=" + lappy +
                '}';
    }
}
