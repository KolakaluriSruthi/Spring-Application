package com.mvn.Employee;

public class EmployeeConstructor {
    int empId;
    String empName;
    String course;
    public EmployeeConstructor(int EmpId,String EmpName,String Course) {
    	this.empId=EmpId;
    	this.empName=EmpName;
    	this.course=Course;
    }
    public void print() {
    	System.out.println("EmpId::"+ empId);
    	System.out.println("EmployeeName:"+ empName);
    	System.out.println("EmployeeCourse:"+ course);
    	
    }
}
