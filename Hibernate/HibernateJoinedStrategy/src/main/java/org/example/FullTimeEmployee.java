package org.example;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="FTE_J")
public class FullTimeEmployee extends Employee{
    private int fix_salary;
    private int extra_no_of_hrs;
    private int extra_salary;

    public FullTimeEmployee(int id, String name, int fix_salary, int extra_no_of_hrs, int extra_salary) {
        super(id, name);
        this.fix_salary = fix_salary;
        this.extra_no_of_hrs = extra_no_of_hrs;
        this.extra_salary = extra_salary;
    }

    public int getFix_salary() {
        return fix_salary;
    }

    public void setFix_salary(int fix_salary) {
        this.fix_salary = fix_salary;
    }

    public int getExtra_no_of_hrs() {
        return extra_no_of_hrs;
    }

    public void setExtra_no_of_hrs(int extra_no_of_hrs) {
        this.extra_no_of_hrs = extra_no_of_hrs;
    }

    public int getExtra_salary() {
        return extra_salary;
    }

    public void setExtra_salary(int extra_salary) {
        this.extra_salary = extra_salary;
    }
}

