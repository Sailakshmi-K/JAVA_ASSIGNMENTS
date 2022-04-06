package org.example;

public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello "+name;
    }
    public void init(){
        System.out.println("I'm init method");
    }
    public void destroy(){
        System.out.println("I'm destroy method ..");
    }
}
