package org.example;

import javax.persistence.*;

@Entity
@Table(name="ProfessorTB")

public class Professor {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "Id")
    private int pid;
    @Column(name = "Name")
    private String pname;
    @Column(name="Gender")
    private String pgender;
    @Column(name = "Dept")
    private String pdpt;

    public String getPgender() {return pgender;}

    public void setPgender(String pgender) {this.pgender = pgender;}

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPid() {return pid;}

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPdpt() {
        return pdpt;
    }

    public void setPdpt(String pdpt) {
        this.pdpt = pdpt;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pgender='" + pgender + '\'' +
                ", pdpt='" + pdpt + '\'' +
                '}';
    }
}
