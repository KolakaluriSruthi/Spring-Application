package com.spring.fifteen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration @ComponentScan("com.spring.fifteen")
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(App.class);
        EmployeeBean empbean=(EmployeeBean)context.getBean(EmployeeBean.class);
        empbean.print();
    }
}
