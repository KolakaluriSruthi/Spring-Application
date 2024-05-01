package com.mvn.DipendencyInjection;

public class Employee {
    private int EmpId;
    private double EmpSalary;
    private Department department;
    Employee (Department dept){
    	department=dept;
    }
    public Employee(int EmpId,double EmpSalary,Department department) {
    	this.EmpId=EmpId;
    	this.EmpSalary=EmpSalary;
    	this.department=department;
    }
    public void setEmpId(int EmpId) {
    	this.EmpId=EmpId;
    }
    public void setEmpSalary(double EmpSalary) {
    	this.EmpSalary=EmpSalary;
    }
    public void setDepartment(Department department) {
    	this.department=department;
    }
    public int getEmpId() {
    	return this.EmpId;
    }
    public double getEmpSalary() {
    	return this.EmpSalary;
    }
    public Department getDepartment() {
    	return this.department;
    }
}
