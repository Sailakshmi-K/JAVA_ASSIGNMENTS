package org.example;

public class Employee {
    private int eid;
    private String domain;
    private Person person;

    public Employee(int eid, String domain, Person person) {
        this.eid = eid;
        this.domain = domain;
        this.person = person;
    }

    @Override
    public String toString() {
        return "Employee{" +
                " person=" + person +
                "\neid=" + eid +
                ", domain='" + domain + '\'' +
                '}';
    }
}
