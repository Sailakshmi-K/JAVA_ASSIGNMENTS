package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Patient_tb")
public class Patient {
    @Id
    private int pt_id;
    private String name;
    private String ph_no;
    private String blood_type;
    private String admit_date;
    private String due_date;

    public Patient(int pt_id, String name, String ph_no, String blood_type, String admit_date, String due_date) {
        this.pt_id = pt_id;
        this.name = name;
        this.ph_no = ph_no;
        this.blood_type = blood_type;
        this.admit_date = admit_date;
        this.due_date = due_date;
    }

    public int getPt_id() {
        return pt_id;
    }

    public void setPt_id(int pt_id) {
        this.pt_id = pt_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPh_no() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public String getAdmit_date() {
        return admit_date;
    }

    public void setAdmit_date(String admit_date) {
        this.admit_date = admit_date;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }
}