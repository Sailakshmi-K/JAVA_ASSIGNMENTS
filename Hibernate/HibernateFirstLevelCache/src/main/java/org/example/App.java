package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        try {
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();

            Teacher t = new Teacher();
          /*  t.setName("Sailakshmi");
            t.setSubject("Java");
            Teacher t1=new Teacher();
            t1.setName("Lahari");
            t1.setSubject("C");
            Teacher t2=new Teacher();
            t2.setName("Pavan");
            t2.setSubject("ML");

            session.save(t);
            session.save(t1);
            session.save(t2);
*/
            System.out.println("Fetching data first time ");
            t=(Teacher) session.get(Teacher.class,6);
            System.out.println(t);
            System.out.println("*********************************************************");

            System.out.println("Fetching 2nd time");
            t=(Teacher) session.get(Teacher.class,6);
            System.out.println(t);

            session.evict(t);

            System.out.println("*********************************************************");
            System.out.println("After evicting data in session ");
            t=(Teacher) session.get(Teacher.class,6);
            System.out.println(t);

            Session session1=sessionFactory.openSession();

            System.out.println("*********************************************************");
            System.out.println("Fetching through different session ");
            t=(Teacher) session1.get(Teacher.class,6);
            System.out.println(t);

            System.out.println("Success");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
/*

Fetching data first time (First time it fetches through database and sends response to cache & to output)
Hibernate: select teacher0_.id as id1_0_0_, teacher0_.Subject as subject2_0_0_, teacher0_.name as name3_0_0_ from Teacher_table teacher0_ where teacher0_.id=?
Teacher{id=6, name='Sailakshmi', Subject='Java'}
*********************************************************
Fetching 2nd time(Response comes from cache)
Teacher{id=6, name='Sailakshmi', Subject='Java'}
*********************************************************
(Clearing object history in session --> 2 methods available 1)evict 2) clear
clear - clears all objects present in session
evict - clears particular object in session)
After evicting data in session
Hibernate: select teacher0_.id as id1_0_0_, teacher0_.Subject as subject2_0_0_, teacher0_.name as name3_0_0_ from Teacher_table teacher0_ where teacher0_.id=?
Teacher{id=6, name='Sailakshmi', Subject='Java'}
*********************************************************
(First level Cache is not available to all sessions ,
 limited to particular defined session, So response comes from database)
Fetching through different session
Hibernate: select teacher0_.id as id1_0_0_, teacher0_.Subject as subject2_0_0_, teacher0_.name as name3_0_0_ from Teacher_table teacher0_ where teacher0_.id=?
Teacher{id=6, name='Sailakshmi', Subject='Java'}
Success

 */