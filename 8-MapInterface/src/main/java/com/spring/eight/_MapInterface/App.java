package com.spring.eight._MapInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
       AmeerpetTechnologies amt = (AmeerpetTechnologies) context.getBean("Courses");
       		amt.print();
    }
}