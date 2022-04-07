package org.example;

import java.util.Set;

public class Director {
    private String name;
    private Set<Movies> movies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Movies> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movies> movies) {
        this.movies = movies;
    }
    public void display(){
        System.out.println("Director name : "+getName());
        System.out.println("Director movies :::::::");
        Set<Movies> m=getMovies();
        for (Movies x:m) {
            System.out.println(x);
        }
    }
}
