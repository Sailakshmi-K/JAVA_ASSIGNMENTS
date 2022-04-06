package org.example;

public class Person {
    private String name;
    private String dob;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
