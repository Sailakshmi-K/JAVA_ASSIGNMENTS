package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Sailakshmi
 * Class Batch:coursename,batchcode,List<Student> students;
 * Class Student:sname,qualification,aggregate%
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringBean.xml");
        Class c=(Class) applicationContext.getBean("class");
        System.out.println(c);
    }
}
/*
Class{batchcode=1, Coursename='Java',
Student=[Student{sname='Sailakshmi', qualification='B.Tech', aggregate=85.56}, Student{sname='Pavan', qualification='M.Tech', aggregate=78.92}]}

Process finished with exit code 0

 */
