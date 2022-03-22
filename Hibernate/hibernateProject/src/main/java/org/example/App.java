package org.example;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      //  String name = br.readLine();
        Book b = new Book();
        b.setAuthorname("Sailakshmi");
        b.setBookid(1);
        b.setBookname("books");
        b.setPrice(Float.parseFloat("235.25"));


        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        int i = (int) session.save(b);
        if (i > 0) {
            transaction.commit();
            System.out.println(b);
            System.out.println("Record added successfully");
        } else {
            System.out.println("Try Again");
        }

    }
}