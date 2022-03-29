package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {
    @Id
    private int account_id;
    private String Account_type;

    @ManyToOne
    private Employee employee;

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getAccount_type() {
        return Account_type;
    }

    public void setAccount_type(String account_type) {
        Account_type = account_type;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account_id=" + account_id +
                ", Account_type='" + Account_type + '\'' +
                ", employee=" + employee +
                '}';
    }
}
