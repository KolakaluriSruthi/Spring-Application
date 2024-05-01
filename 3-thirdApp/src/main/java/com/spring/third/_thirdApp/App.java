package com.spring.third._thirdApp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*Resource res=new ClassPathResource("springconfig3.xml");
        XmlBeanFactory factory=new XmlBeanFactory(res);
        EmployeeClass myEmployee= (EmployeeClass) factory.getBean("employee");
        myEmployee.printEmployee();*/
    	
    	Resource res=new FileSystemResource("C:\\Users\\DELL 7470\\Desktop\\filesystem\\springconfig3.xml.txt");
        XmlBeanFactory factory=new XmlBeanFactory(res);
        EmployeeClass myEmployee= (EmployeeClass) factory.getBean("employee");
        myEmployee.printEmployee();
    }
}
