package com.mvn.DipendencyInjection;

public class Person {
   private String Pname;
   private Employee employee;
   Person(Employee emp){
	   employee=emp;
   }
   public Person(String Pname,Employee employee) {
	   this.Pname=Pname;
	   this.employee=employee;
   }
   public void setPname(String Pname) {
	   this.Pname=Pname;
   }
   public void setEmployee(Employee employee) {
	   this.employee=employee;
   }
   public String getPname() {
	   return this.Pname;
   }
   public Employee getEmployee() {
	   return this.employee;
   }
   void print() {
	   System.out.println(Pname);
	   System.out.println(employee.getEmpId());
	   System.out.println(employee.getEmpSalary());
	   System.out.println(employee.getDepartment().getDeptId());
	   System.out.println(employee.getDepartment().getDeptName());
   }
}
