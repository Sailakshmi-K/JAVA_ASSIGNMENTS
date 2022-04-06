package org.example;

import java.util.List;

public class Singer {
    private String name;
    private String dob;
    private int age;
    private List<String> songlist;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSonglist() {
        return songlist;
    }

    public void setSonglist(List<String> songlist) {
        this.songlist = songlist;
    }

    public void display(){
        System.out.println("Singer name : "+getName());
        System.out.println("Singer dob : "+getDob());
        System.out.println("Singer age : "+getAge());
        System.out.println("Song list");
        List<String> songs=getSonglist();
        for(String x: songs){
            System.out.println(x);
        }
    }
}
