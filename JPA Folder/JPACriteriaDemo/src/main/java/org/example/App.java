package org.example;

/**
 * Sailakshmi
 * JPA crieria
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("sai");
        EntityManager em=emfactory.createEntityManager();
        CriteriaBuilder  cb=em.getCriteriaBuilder();
        CriteriaQuery<Object> cq= cb.createQuery();
        Root<Teacher> from=cq.from(Teacher.class);
       Teacher t=new Teacher();
        em.getTransaction().begin();

       t.setTname("Ishitha");
        t.setTsal("50000");
        t.setTdeg("Msc");
        t.setTname("Sailakshmi");
        t.setTsal("30000");
        t.setTdeg("Bsc");
        t.setTname("Pavan");
        t.setTsal("250000");
        t.setTdeg("M.Tech");

        em.persist(t);
        em.getTransaction().commit();


        System.out.println("Select all records from teacher");
        CriteriaQuery<Object> select=cq.select(from);
        TypedQuery<Object> tq=em.createQuery(select);
        List<Object> resultlist=tq.getResultList();

        System.out.println("*******************Query******************* ");
        for(Object o:resultlist){
            System.out.println(o);
        }

        System.out.println("*********only name and deg 2 columns *************");

        for(Object o:resultlist){
            Teacher t1=(Teacher)o;
            System.out.println(t1.getTname()+"--->"+t1.getTdeg());
        }

        System.out.println("******* Descending order ***********");
        CriteriaQuery<Object> desc=cq.orderBy(cb.desc(from.get("tsal")));
        TypedQuery<Object> tq1= em.createQuery(desc);
        List<Object> rl1=tq.getResultList();

        for(Object o:rl1){
            Teacher t2=(Teacher) o;
            System.out.println(t2.getTname()+"--->"+t2.getTsal());
        }

     }
}

/*

Select all records from teacher
Hibernate:
    select
        teacher0_.Id as id1_0_,
        teacher0_.Deg as deg2_0_,
        teacher0_.Name as name3_0_,
        teacher0_.Salary as salary4_0_
    from
        Teacher_JPA teacher0_
*******************Query*******************
Teacher{tid=14, tname='Ishitha', tsal='50000', tdeg='Msc'}
Teacher{tid=15, tname='Sailakshmi', tsal='30000', tdeg='Bsc'}
Teacher{tid=16, tname='Pavan', tsal='250000', tdeg='M.Tech'}
*********only name and deg 2 columns *************
Ishitha--->Msc
Sailakshmi--->Bsc
Pavan--->M.Tech
******* Descending order ***********
Hibernate:
    select
        teacher0_.Id as id1_0_,
        teacher0_.Deg as deg2_0_,
        teacher0_.Name as name3_0_,
        teacher0_.Salary as salary4_0_
    from
        Teacher_JPA teacher0_
Ishitha--->50000
Sailakshmi--->30000
Pavan--->250000

Process finished with exit code 0

 */