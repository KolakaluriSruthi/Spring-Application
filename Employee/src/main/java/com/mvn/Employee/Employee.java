package com.mvn.Employee;

public class Employee {
   int EmpId;
   String EmpName;
   public static void main(String[]args) {
	   Employee emp=new Employee();
	   int id=emp.EmpId=101;
	   String Name=emp.EmpName="sri";
	   System.out.println(id);
	   System.out.println(Name);
   }
}
