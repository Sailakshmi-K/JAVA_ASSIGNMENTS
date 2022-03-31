package org.example;

import javax.persistence.*;

@Entity
@Table(name = "Books_121")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="BookId")
    private int id;

    @Column(name="BookTitle")
    private String bname;

    @Column(name="AuthorName")
    private String author;

    @Column(name="BookPrice")
    private float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

