package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * Sailakshmi
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Library l=new Library();
        l.setLname("MG Library");

        Books b2=new Books();

        b2.setId(101);
        b2.setBname("HelloWorld");
        b2.setAuthor("Sailakshmi");
        b2.setPrice(450);

        Books b3=new Books();
        b3.setId(102);
        b3.setBname("HelloC");
        b3.setAuthor("Lahari");
        b3.setPrice(380);

        Books b4=new Books();
        b4.setId(103);
        b4.setBname("HelloJava");
        b4.setAuthor("Pavan");
        b4.setPrice(460);



        Set<Books> bookset=new HashSet<>();

        bookset.add(b2);
        bookset.add(b3);
        bookset.add(b4);


        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(l);
        session.save(b2);
        session.save(b3);
        session.save(b4);

        session.getTransaction().commit();
        System.out.println("Success");
    }
}
