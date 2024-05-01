package com.spring.nineteen;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeBean {
	@Id
	private int empId;
	private String empName;
	private double empSalary;

	public EmployeeBean() {
		super();
	}

	public EmployeeBean(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
}
