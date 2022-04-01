package org.example;

import javax.persistence.*;

@Entity
@Table(name = "Teacher_JPA")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private int tid;
    @Column(name = "Name")
    private String tname;
    @Column(name="Salary")
    private int tsal;
    @Column(name = "Deg")
    private String tdeg;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getTsal() {
        return tsal;
    }

    public void setTsal(int tsal) {
        this.tsal = tsal;
    }

    public String getTdeg() {
        return tdeg;
    }

    public void setTdeg(String tdeg) {
        this.tdeg = tdeg;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tsal='" + tsal + '\'' +
                ", tdeg='" + tdeg + '\'' +
                '}';
    }
}
