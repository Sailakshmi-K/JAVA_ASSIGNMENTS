package dao;

import org.example.Professor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

//CRUD :: Create,Retrieve,Update,Delete
//insert-save
//update and delete-Query Interface-createquery()
//retrieve-fetch and projection
public class ProfessorDao {

   static Configuration configuration=new Configuration().configure();

    public static int insertRecord(Professor p){
        Session session =configuration.buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        int i=(int)session.save(p);
        if(i>0){
            transaction.commit();
        }
        else{
            //do nothing
        }
        return i;
    }

    public static int updateRecord(String salutation,String gender){

        Session session =configuration.buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Query q=session.createQuery("update Professor set Name = concat(:s, Name) where gender = :g");
        q.setParameter("s",salutation);
        q.setParameter("g",gender);
        int j=q.executeUpdate();
        transaction.commit();
        return j;
    }

    public static int deleteRecord(String dept){
        Session session =configuration.buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Query q=session.createQuery("Delete from Professor where Dept=:x");
        q.setParameter("x",dept);
        int j=q.executeUpdate();
        transaction.commit();
        return j;
    }

    public static List<Professor> fetchProfessor(){
        Session session =configuration.buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Query q=session.createQuery("from Professor");
        return q.list();
    }

}
