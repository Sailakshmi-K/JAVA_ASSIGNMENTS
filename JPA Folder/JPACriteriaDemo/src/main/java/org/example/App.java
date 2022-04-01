package org.example;

/**
 * Sailakshmi
 * JPA crieria
 */
import javax.persistence.*;
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
       /* Teacher t=new Teacher();
        Teacher t1=new Teacher();
        Teacher t2=new Teacher();
        em.getTransaction().begin();
        t.setTname("Ishitha");
        t.setTsal(50000);
        t.setTdeg("Msc");
        t2.setTname("Sailakshmi");
        t2.setTsal(30000);
        t2.setTdeg("Bsc");
        t1.setTname("Pavan");
        t1.setTsal(250000);
        t1.setTdeg("M.Tech");

        em.persist(t);
        em.persist(t1);
        em.persist(t2);
        em.getTransaction().commit();*/


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
            Teacher t6=(Teacher)o;
            System.out.println(t6.getTname()+"--->"+t6.getTdeg());
        }

        System.out.println("******* Descending order ***********");
        CriteriaQuery<Object> desc=cq.orderBy(cb.desc(from.get("tsal")));
        TypedQuery<Object> tq1= em.createQuery(desc);
        List<Object> rl1=tq.getResultList();

        for(Object o:rl1){
            Teacher t5=(Teacher) o;
            System.out.println(t5.getTname()+"--->"+t5.getTsal());
        }

        // Aggregate Function - min()
        System.out.println("********MIN()****************");

        Query q=em.createQuery("select MIN(e.tsal) from Teacher e");
        int res=(int) q.getSingleResult();
        System.out.println("Min salary :"+res);

        // Aggregate Function - max()

        System.out.println("********MAX()****************");
        Query q1=em.createQuery("select MAX(e.tsal) from Teacher e");
        int res1=(int) q1.getSingleResult();
        System.out.println("MAX salary :"+res1);

        // between

        System.out.println("********BETWEEN**************");
        Query q2=em.createQuery("select e from Teacher e where e.tsal between 20000 and 70000");
        List<Teacher> rl2=(List<Teacher>) q2.getResultList();

        for(Teacher o:rl2){
            System.out.println(o);
        }

        System.out.println("*************LIKE*****************");
        Query q3=em.createQuery("select e from Teacher e where e.tname LIKE 'P%'");
        List<Teacher> rl3=(List<Teacher>) q3.getResultList();

        for(Teacher o:rl3){
            System.out.println(o);
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
Teacher{tid=21, tname='Ishitha', tsal='50000', tdeg='Msc'}
Teacher{tid=22, tname='Pavan', tsal='250000', tdeg='M.Tech'}
Teacher{tid=23, tname='Sailakshmi', tsal='30000', tdeg='Bsc'}
*********only name and deg 2 columns *************
Ishitha--->Msc
Pavan--->M.Tech
Sailakshmi--->Bsc
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
Pavan--->250000
Sailakshmi--->30000
********MIN()****************
Hibernate:
    select
        min(teacher0_.Salary) as col_0_0_
    from
        Teacher_JPA teacher0_
Min salary :30000
********MAX()****************
Hibernate:
    select
        max(teacher0_.Salary) as col_0_0_
    from
        Teacher_JPA teacher0_
MAX salary :250000
********BETWEEN**************
Hibernate:
    select
        teacher0_.Id as id1_0_,
        teacher0_.Deg as deg2_0_,
        teacher0_.Name as name3_0_,
        teacher0_.Salary as salary4_0_
    from
        Teacher_JPA teacher0_
    where
        teacher0_.Salary between 20000 and 70000
Teacher{tid=21, tname='Ishitha', tsal='50000', tdeg='Msc'}
Teacher{tid=23, tname='Sailakshmi', tsal='30000', tdeg='Bsc'}
*************LIKE*****************
Hibernate:
    select
        teacher0_.Id as id1_0_,
        teacher0_.Deg as deg2_0_,
        teacher0_.Name as name3_0_,
        teacher0_.Salary as salary4_0_
    from
        Teacher_JPA teacher0_
    where
        teacher0_.Name like 'P%'
Teacher{tid=22, tname='Pavan', tsal='250000', tdeg='M.Tech'}

Process finished with exit code 0
 */