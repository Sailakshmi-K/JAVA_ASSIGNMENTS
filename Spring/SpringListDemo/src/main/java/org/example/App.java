package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringBean.xml");
        Singer s=(Singer) applicationContext.getBean("singer");
        s.display();
    }
}
