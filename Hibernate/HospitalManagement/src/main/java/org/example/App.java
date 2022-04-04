package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        try {

            Patient pt1=new Patient(1,"A","8172635401","A+","23/03/2022","23/04/2022");
            Patient pt2=new Patient(2,"B","8145635489","A","02/03/2022","02/04/2022");
            Patient pt3=new Patient(3,"C","9162635323","B+","11/03/2022","11/04/2022");
            Patient pt4=new Patient(4,"D","9272635434","O+","19/03/2022","19/04/2022");
            Patient pt5=new Patient(5,"E","7872635456","B-","24/03/2022","24/04/2022");
            Patient pt6=new Patient(6,"F","8972635445","AB","31/03/2022","31/04/2022");

            List<Patient> p1=new ArrayList<Patient>();
            p1.add(pt1);
            p1.add(pt2);
            p1.add(pt3);
            List<Patient> p2=new ArrayList<Patient>();
            p2.add(pt4);
            p2.add(pt5);
            p2.add(pt6);

            Staff st1=new Staff(201,"P","MBBS",2,"9284671839","Day Time");
            Staff st2=new Staff(202,"Q","Mphil",3,"9344671834","Night Time");
            Staff st3=new Staff(203,"R","MS",1.5f,"9283451856","Day Time");
            Staff st4=new Staff(204,"S","Mch",1,"9286787890","NightTime");

            List<Staff> s1=new ArrayList<Staff>();
            s1.add(st1);
            s1.add(st2);
            List<Staff> s2=new ArrayList<Staff>();
            s2.add(st3);
            s2.add(st4);

            Doctor d=new Doctor(101,"Amritha",3,"General Surgeon","Full time","934628651",p1,s1);
            Doctor d1=new Doctor(102,"Suresh",4,"Cardiologist","Full time","9173402534",p2,s2);
            Doctor d2=new Doctor(103,"Pooja",2.5f,"Neurologist","Full time","9173402534",p1,s2);
            Doctor d3=new Doctor(104,"Pavan",3.5f,"Cardiologist","Full time","9173402534",p2,s1);


            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(pt1);
            session.save(pt2);
            session.save(pt3);
            session.save(pt4);
            session.save(pt5);
            session.save(pt6);
            session.save(st1);
            session.save(st2);
            session.save(st3);
            session.save(st4);
            session.save(d);
            session.save(d1);
            session.save(d2);
            session.save(d3);

            session.getTransaction().commit();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
