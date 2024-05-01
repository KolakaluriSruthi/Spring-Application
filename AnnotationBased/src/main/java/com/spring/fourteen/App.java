package com.spring.fourteen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration @ComponentScan("com.spring.fourteen")
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(App.class);
        StudentBean stdbean=(StudentBean)context.getBean(StudentBean.class);
        stdbean.display();
    }
}
