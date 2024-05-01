package com.spring.thirteen;

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
       ProductBean pbean=(ProductBean) context.getBean("getProd");
       pbean.printProduct();
    }
}
