package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context= new ClassPathXmlApplicationContext("SpringBean.xml");
        Hello h=(Hello) context.getBean("hello");
        System.out.println(h.getName());
        h.print();
    }
}
