package com.spring.eleven;

public class StudentBean {
       private int id;
       private String name;
       private String batch;
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
       public void setCourse(String course) {
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
       public void print() {
    	   System.out.println("Student details");
    	   System.out.println("Student Id:"+id);
    	   System.out.println("Student Name"+name);
    	   System.out.println("Student Batch:"+batch);
    	   System.out.println("Student Course:"+course);
       }
}
