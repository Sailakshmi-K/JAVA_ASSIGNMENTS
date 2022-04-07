package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Sailakshmi
 * Spring Set Demo
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring.xml");
        Director d=(Director) applicationContext.getBean("director");
        d.display();
    }
}

/*
Director name : RAJMOULI
Director movies :::::::
Movies{name='RRR', releaseDate='25/03/2022'}
Movies{name='Bahubali', releaseDate='21/09/2018'}

Process finished with exit code 0
 */