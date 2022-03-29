package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class App
{
    public static void main( String[] args ) throws IOException {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            Laptop l=new Laptop();

            System.out.println("Enter laptop id :");
            l.setLid(Integer.parseInt(br.readLine()));
            System.out.println("Enter laptop name : ");
            l.setLname(br.readLine());

            Student s=new Student();

            System.out.println("Enter student id : ");
            s.setSid(Integer.parseInt(br.readLine()));
            System.out.println("Enter student name : ");
            s.setSname(br.readLine());
            s.setLappy(l);


            Employee e=new Employee();
            e.setEmployee_name("Sailakshmi");

            Account a=new Account();

            a.setAccount_id(101);
            a.setAccount_type("SBI");
            a.setEmployee(e);

            Account a1=new Account();
            a1.setAccount_id(102);
            a1.setAccount_type("ICIC");
            a1.setEmployee(e);

            Account a2=new Account();
            a2.setAccount_id(103);
            a2.setAccount_type("HDFC");
            a2.setEmployee(e);


            Set<Account> accountSet=new HashSet<>();

            accountSet.add(a);
            accountSet.add(a1);
            accountSet.add(a2);

            e.setAccount(accountSet);



            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            session.save(e);
            session.save(a);
            session.save(a1);
            session.save(a2);

            session.getTransaction().commit();
            System.out.println("Success");

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
