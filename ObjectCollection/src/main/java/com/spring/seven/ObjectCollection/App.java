package com.spring.seven.ObjectCollection;

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
       ApplicationContext context=new ClassPathXmlApplicationContext("springconfig7.xml");
       AmeerpetTechnologiesBean amptBean=(AmeerpetTechnologiesBean) context.getBean("institute");
       amptBean.print();
    }
}
