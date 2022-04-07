package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Sailakshmi
 * Spring MAP Demo
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringBean.xml");
        DID d=(DID) applicationContext.getBean("DID");
        d.display();
    }
}

/*

Season name : ARC
Brand Partners : [XYZ, PQR]
Participants{name='Sita', address='Pune'}	Remo
Participants{name='Gita', address='Pune'}	RJ
Participants{name='Latha', address='Pune'}	DJ

Process finished with exit code 0
 */