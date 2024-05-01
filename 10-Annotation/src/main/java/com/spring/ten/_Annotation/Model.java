package com.spring.ten._Annotation;

public class Model {
	private int id;
	private String name;
	private String model;
	public Model() {
		
	}
	public Model(int id,String name,String model) {
		this.id=id;
		this.name=name;
		this.model=model;
	}
	public void setId(int id) {
		this.id=id;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getModel() {
		return this.model;
	}
	public void Start() {
    	System.out.println("Car Started");
    }
}
