package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Sailakshmi
 * Inner bean demo
 * College class- String college_name,Teacher t,String Subject
 * Teacher class- String name,String qualification, String Date of joining
 * College HAS-A Teacher
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring.xml");
        College c=(College) applicationContext.getBean("college");
        System.out.println(c);
    }
}

/*
College{college_name='RVR and JC College of Engineering', subject='Electronics'
 t=Teacher{tname='Sathish', qualification='M.Sc', date_of_joining='23/12/2021'}}

Process finished with exit code 0
 */