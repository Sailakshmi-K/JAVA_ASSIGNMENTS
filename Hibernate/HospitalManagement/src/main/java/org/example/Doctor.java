package org.example;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "Doctor_tb")
public class Doctor {
    @Id
    private int doc_id;
    private String doc_name;
    private float exp;
    private String Specialization;
    private String type_emp;
    private String ph_no;
    @ManyToMany
    private List<Patient> patientsList;
    @OneToMany
    private List<Staff> staffList;

    public Doctor(int doc_id, String doc_name, float exp, String specialization, String type_emp, String ph_no, List<Patient> patientsList, List<Staff> staffList) {
        this.doc_id = doc_id;
        this.doc_name = doc_name;
        this.exp = exp;
        Specialization = specialization;
        this.type_emp = type_emp;
        this.ph_no = ph_no;
        this.patientsList = patientsList;
        this.staffList = staffList;
    }

    public int getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public float getExp() {
        return exp;
    }

    public void setExp(float exp) {
        this.exp = exp;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public String getType_emp() {
        return type_emp;
    }

    public void setType_emp(String type_emp) {
        this.type_emp = type_emp;
    }

    public String getPh_no() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

    public List<Patient> getPatientsList() {
        return patientsList;
    }

    public void setPatientsList(List<Patient> patientsList) {
        this.patientsList = patientsList;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }
}
