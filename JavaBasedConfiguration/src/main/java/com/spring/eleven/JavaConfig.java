package com.spring.eleven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean("id1")
       public StudentBean getBean() {
    	   StudentBean std=new StudentBean();
    	   std.setId(101);
    	   std.setName("sruthi");
    	   std.setBatch("12th batch");
    	   std.setCourse("javafullstack");
    	   return std;
       }
	@Bean("id2")
	public StudentBean getBean1() {
		StudentBean bean=new StudentBean();
		bean.setId(102);
		bean.setName("meghana");
		bean.setBatch("11th batch");
		bean.setCourse("pythonfullstack");
		return bean;
	}
}
