package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Sailakshmi
 * Spring Autowire-byName,byType
 */
public class App 
{
    public static void main( String[] args )
    {
       /* ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ByName.xml");
        Student s=(Student) applicationContext.getBean("student");
        System.out.println("*******BYNAME**********");
        s.display();

        ApplicationContext applicationContext1=new ClassPathXmlApplicationContext("ByType.xml");
        Student s1=(Student) applicationContext1.getBean("student");
        System.out.println("*******BYTYPE**********");
        s1.display();*/

       ApplicationContext applicationContext2=new ClassPathXmlApplicationContext("Constructor.xml");
        Student s2=(Student) applicationContext2.getBean("student");
        System.out.println("*******CONSTRUCTOR**********");
        s2.display();
    }
}

/*
*******BYNAME**********
Student Id : 101
Student name : Ravi
Student address : Address{H_no='42-2', city='Pune', State='Maharashtra'}
*******BYTYPE**********
Student Id : 101
Student name : Ravi
Student address : Address{H_no='42-2', city='Pune', State='Maharashtra'}
*******CONSTRUCTOR**********
Student Id : 101
Student name : Ravi
Student address : Address{H_no='42-2', city='Pune', State='Maharashtra'}

Process finished with exit code 0
 */