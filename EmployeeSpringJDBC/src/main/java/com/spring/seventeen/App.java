package com.spring.seventeen;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
        EmployeeBean empBean=(EmployeeBean) context.getBean("EmpBean");
        empBean.create();
        empBean.insert();
        empBean.insert1();
        empBean.delete();
        empBean.updateRecord();
        empBean.getoneRecord();
        empBean.getAll();  
    }
}
