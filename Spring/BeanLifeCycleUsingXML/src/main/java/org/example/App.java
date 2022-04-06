package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Sailakshmi
 *
 we have mainly 2 methods :
 1) public void init() - initilialization purpose
 2) public void destroy() - Clean up code

 Intially bean object is instantiated.
 Next using setXXX() method , it initiliazes the values
 next init() is called if written
 if any external files are connected ,then it loads values into those files like .. Database files etc.
 Next we read and use the bean
 destroy() --> where clean up code is written.
 Next object is destroyed.

 We can configure these in 3 ways::
 1) Xml
 2) Spring Interface
 3)Annotations

 Here using XML we called init () & destroy()
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring.xml");
        Hello h=(Hello) applicationContext.getBean("hello");
        System.out.println(h);
        applicationContext.registerShutdownHook();
    }
}
/*
I'm init method
Hello sailakshmi
I'm destroy method ..

Process finished with exit code 0
 */
