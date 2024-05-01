package com.spring.five.DIFormObjects;

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
       ApplicationContext context=new ClassPathXmlApplicationContext("springconfig2.xml");
       OrderBean orderBean=(OrderBean) context.getBean("order");
       orderBean.print();
    }
}
