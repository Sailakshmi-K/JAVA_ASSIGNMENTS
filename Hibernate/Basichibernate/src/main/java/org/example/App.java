package org.example;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App 
{
    public static void main( String[] args ) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter name :");
        String name = br.readLine();
        System.out.println("Enter age :");
        int age= Integer.parseInt(br.readLine());
        System.out.println("Enter subject :");
        String subject=br.readLine();
        Student s = new Student();

        s.setS_age(age);
        s.setS_name(name);
        s.setS_subject(subject);


        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        System.out.println(s);

        int i = (int) session.save(s);
        if (i > 0) {
            transaction.commit();
            System.out.println(s);
            System.out.println("Record added successfully");
        } else {
            System.out.println("Try Again");
        }
    }
}
