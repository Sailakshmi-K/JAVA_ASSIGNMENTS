package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        EntityManagerFactory emf= Persistence.createEntityManagerFactory("sai");
        EntityManager em1= emf.createEntityManager();

        Teacher t1=em1.find(Teacher.class,6);
        System.out.println(t1);

    }
}
