package com.spring.nine._Autowiring;

public class Second {
    private int id;
    private String name;
    private String course;
    public Second() {
    	
    }
    public Second(int id,String name,String course) {
    	this.id=id;
    	this.name=name;
    	this.course=course;
    	System.out.println("this is constructor");
    }
    public void setId(int id) {
    	this.id=id;
    	System.out.println("this is setter");
    }
    public void setName(String name) {
    	this.name=name;
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
    public String getCourse() {
    	return this.course;
    }
}
