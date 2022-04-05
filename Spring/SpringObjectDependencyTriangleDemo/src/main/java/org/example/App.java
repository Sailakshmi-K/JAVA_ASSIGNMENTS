package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Sailakshmi
 * Shape==>Triangle,Circle,Rectangle
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringDemo.xml");
        Shape s=(Shape) applicationContext.getBean("shapes");
        s.display();
    }
}
/*
***********TRIANGLE COORDINATES***********
Triangle{p1=Point{x=4, y=7}, p2=Point{x=5, y=10}, p3=Point{x=9, y=15}}
***********RECTANGLE COORDINATES***********
Rectangle{p1=Point{x=4, y=7}, p2=Point{x=5, y=10}, p3=Point{x=9, y=15}, p4=Point{x=20, y=26}}
***************CIRCLE*******************
Circle center is (4,7)
Radius :5.0
 */
