package com.employee1.Employee1.interfacee;

public class EmployeeImp implements EmployeeInterface {
      private String name;
      private int age;
      private double salary;
      
 public EmployeeImp() {
	 
 }
 public EmployeeImp(String name,int age,double salary) {
	 this.name=name;
	 this.age=age;
	 this.salary=salary;
 }
	@Override
	public void setName(String name) {
		this.name=name;

	}

	@Override
	public void setAge(int age) {
		this.age=age;

	}

	@Override
	public void setSalary(double salary) {
		this.salary=salary;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}

}
