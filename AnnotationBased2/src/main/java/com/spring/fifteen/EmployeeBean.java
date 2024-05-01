package com.spring.fifteen;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
	@Value("101")
    private int empId;
	@Value("Meghana")
    private String empName;
	@Value("25000")
    private int empsalary;
    public EmployeeBean() {
    	
    }
    public EmployeeBean(int empId,String empSalary,int empsalary) {
    	this.empId=empId;
    	this.empName=empName;
    	this.empsalary=empsalary;
    }
    public void setId(int empId) {
    	this.empId=empId;
    	
    }
    public void setName(String empName) {
    	this.empName=empName;
    }
    public void setSalary(int empsalary) {
    	this.empsalary=empsalary;
    }
    public int getId() {
    	return this.empId;
    }
    public String getName() {
    	return this.empName;
    }
    public int getSalary() {
    	return this.empsalary;
    }
    public void print() {
    	System.out.println("Employee Details:");
    	System.out.println("Employee Id:"+empId);
    	System.out.println("Employee Name:"+empName);
    	System.out.println("Employee Salary:"+empsalary);
    }
}
