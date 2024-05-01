package com.spring.four.StudentConstructorInjection;

public class StudentBean {
    int id;
    String name;
    String course;
    String batch;
    String location;
    public StudentBean() {
    	super();
    }
    public StudentBean(int id,String name,String course,String batch,String location) {
    	super();
    	this.id=id;
    	this.name=name;
    	this.course=course;
    	this.batch=batch;
    	this.location=location;
    }
    public void setId(int id) {
    	this.id=id;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public void setCourse(String course) {
    	this.course=course;
    }
    public void setBatch(String batch) {
    	this.batch=batch;
    }
    public void setLocation(String location) {
    	this.location=location;
    }
    public int getId() {
    	return this.id;
    }
    public String getName() {
    	return this.name;
    }
    public String getCourse() {
    	return this.course;
    }
    public String getBatch() {
    	return this.batch;
    }
    public String getLocation() {
    	return this.location;
    }
    public void printStudent() {
    	System.out.println("student Id:"+id);
    	System.out.println("student Name:"+name);
    	System.out.println("student Course:"+course);
    	System.out.println("student Batch:"+batch);
    	System.out.println("student Location:"+location);
    }
}
