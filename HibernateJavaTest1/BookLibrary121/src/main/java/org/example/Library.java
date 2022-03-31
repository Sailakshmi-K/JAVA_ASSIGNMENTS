package org.example;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Library_Table")
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="LibraryId")
    private int lid;

    @Column(name="LibraryName")
    private String lname;

    @OneToMany
    private Set<Books> books;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Set<Books> getBooks() {
        return books;
    }

    public void setBooks(Set<Books> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "lid=" + lid +
                ", lname='" + lname + '\'' +
                ", books=" + books +
                '}';
    }
}
