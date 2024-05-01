package com.spring.third._thirdApp;

public class EmployeeClass {
	private int empId;
	private String name;
	private double empSalary;
	private int empDeptno;
	private String empDOJ;
	
	public EmployeeClass() {
		super();
		// TODO Auto-generated constructor stub
	} 

	public EmployeeClass(int empId, String name, double empSalary, int empDeptno, String empDOJ) {
		super();
		this.empId = empId;
		this.name = name;
		this.empSalary = empSalary;
		this.empDeptno = empDeptno;
		this.empDOJ = empDOJ;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpDeptno() {
		return empDeptno;
	}

	public void setEmpDeptno(int empDeptno) {
		this.empDeptno = empDeptno;
	}

	public String getEmpDOJ() {
		return empDOJ;
	}

	public void setEmpDOJ(String empDOJ) {
		this.empDOJ = empDOJ;
	}
	
	

	public void printEmployee() {
		System.out.println("EmployeeClass [empId=" + empId + ", name=" + name + ", empSalary=" + empSalary + ", empDeptno="
				+ empDeptno + ", empDOJ=" + empDOJ + "]");
		
	}
}
