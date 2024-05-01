package com.spring.eleven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
       StudentBean sb=(StudentBean) context.getBean("id1");
       sb.print();
    }
}
