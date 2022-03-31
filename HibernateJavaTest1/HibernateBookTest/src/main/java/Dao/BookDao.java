package Dao;


import org.example.Book;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class BookDao {

   static Configuration configuration=new Configuration().configure("hibernate.cfg.xml");

   public static int insert(Book b){

       Session session=configuration.buildSessionFactory().openSession();
       Transaction transaction=session.beginTransaction();

       int i=(int) session.save(b);
       if(i>0){
           transaction.commit();
       }
       else{}
       return 1;
   }
     public static List fetchByPrice(float p){
         Session session=configuration.buildSessionFactory().openSession();
         Criteria criteria=session.createCriteria(Book.class);
         criteria.add(Restrictions.gt("price",p));
       return criteria.list();
     }

     public static  List fetchByAuthor(String author){
         Session session=configuration.buildSessionFactory().openSession();
         Criteria criteria=session.createCriteria(Book.class);
         criteria.add(Restrictions.eq("author",author));
         return criteria.list();
     }

}
