package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {
        try {

            Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
            SessionFactory sessionFactory=configuration.buildSessionFactory();
            Session session=sessionFactory.openSession();
            Transaction transaction=session.beginTransaction();


            Employee e = new Employee(1,"Sailakshmi");
            PartTimeEmployee pte = new PartTimeEmployee(2,"Lahari",5,400);
            FullTimeEmployee fte = new FullTimeEmployee(3,"Pavan",30000,3,600);

            session.save(e);
            session.save(pte);
            session.save(fte);

            transaction.commit();

            System.out.println("Success");

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
