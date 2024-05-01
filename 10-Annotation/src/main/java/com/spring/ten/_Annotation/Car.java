package com.spring.ten._Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class Car {
	@Autowired
	@Qualifier("model2")
	 private Model model;

		/*
		 * public Car() {
		 * 
		 * } // @Autowired// public Car(Model model) { this.model=model;
		 * System.out.println("this is constructor method"); } //@Autowired// public
		 * void setModel(Model model) { this.model=model;
		 * System.out.println("this is setter method"); } public Model getModel() {
		 * return this.model; }
		 */
     public void CarStarted() {
    	 if(model!=null) {
    		 model.Start();
    		 System.out.println("car Id:"+model.getId());
    		 System.out.println("Car Name:"+model.getName());
    		 System.out.println("Car Model:"+model.getModel());
    	 }
    	 else {
    		 System.out.println(" 🚕 Not Started");
    		 
    	 }
    
     }
}
