package com.spring.nine._Autowiring;

public class First {
	private Second second;
    public First() {
    	
    }
    public First(Second second) {
    	this.second=second;
    }
    public void setSecond(Second second) {
    	this.second=second;
    }
    public Second getSecond() {
    	return this.second;
    }
    public void print() {
    	System.out.println("Id:"+second.getId());
    	System.out.println("Name:"+second.getName());
    }
}
