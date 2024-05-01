package com.spring.sixteen;

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
       ApplicationContext context= new ClassPathXmlApplicationContext("springconfig.xml");
       StudentBean stdBean=(StudentBean) context.getBean("jdbcId3");
      // stdBean.create();//
       stdBean.insert();
       //stdBean.delete();//
       // stdBean.updateRecord();//
       //stdBean.getoneRecord();//
        
        
    }
}
