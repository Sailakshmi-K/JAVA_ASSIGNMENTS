package org.example;

import javax.persistence.*;

@Entity
@Table(name = "BookTable")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookid")
    private int bookid;
    @Column(name = "authorname")
    private String authorname;
    @Column(name = "bookname")
    private String bookname;
    @Column(name = "price")
    private float price;

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
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
                "bookid=" + bookid +
                ", authorname='" + authorname + '\'' +
                ", bookname='" + bookname + '\'' +
                ", price=" + price +
                '}';
    }
}
