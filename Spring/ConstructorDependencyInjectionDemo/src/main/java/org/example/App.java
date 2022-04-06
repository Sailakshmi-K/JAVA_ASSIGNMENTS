package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Sailakshmi
 * Class - Person: Name,Dob
 * Class- Employee : id,domain
 * executing using constructor arg dependency injection
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringBean.xml");
        Employee employee=(Employee) applicationContext.getBean("emp");
        System.out.println(employee);
    }
}
/*
Employee{ person=Person{name='Saialakshmi', dob='23/12/2000'}
eid=101, domain='JAVA DEVELOPER'}

Process finished with exit code 0
 */
