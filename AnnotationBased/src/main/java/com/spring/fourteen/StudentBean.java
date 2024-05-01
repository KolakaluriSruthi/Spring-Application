package com.spring.fourteen;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentBean {
	@Value("1")
      private int id;
	@Value("sruthi")
      private String name;
	@Value("12th batch")
      private String batch;
	@Value("JavaFullStack")
      private String course;
      public StudentBean() {
    	  
      }
      public StudentBean(int id,String name,String batch,String course) {
    	  this.id=id;
    	  this.name=name;
    	  this.batch=batch;
    	  this.course=course;
      }
      public void setId(int id) {
    	  this.id=id;
    	  
      }
      public void setName(String name) {
    	  this.name=name;
      }
      public void setBatch(String batch) {
    	  this.batch=batch;
      }
      public  void setCourse(String course) {
    	  this.course=course;
      }
      public int getId() {
    	  return this.id;
      }
      public String getName() {
    	  return this.name;
      }
      public String getBatch() {
    	  return this.batch;
      }
      public String getCourse() {
    	  return this.course;
      }
      public void display() {
    	  System.out.println("Student Details:");
    	  System.out.println("Student id:"+id);
    	  System.out.println("Student name:"+name);
    	  System.out.println("Student batch:"+batch);
    	  System.out.println("Student course:"+course);
      }
}
