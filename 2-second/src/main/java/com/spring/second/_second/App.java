package com.spring.second._second;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Resource res=new ClassPathResource("springconfig2.xml");
        XmlBeanFactory factory=new XmlBeanFactory(res);
        BeanClass2 myBean=(BeanClass2) factory.getBean("mul");
        myBean.printMultiply();
    }
}
