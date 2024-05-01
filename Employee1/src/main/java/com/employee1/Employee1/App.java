package com.employee1.Employee1;

import com.employee1.Employee1.interfacee.EmployeeImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      /*  Employee emp=new Employee("Keerthi",24,25000);
       emp.setName("Keerthi");
       emp.setAge(24);
       emp.setSalary(25000);
       System.out.println(emp.getName());
       System.out.println(emp.getAge());
       System.out.println(emp.getSalary());*/
    	EmployeeImp emp1=new EmployeeImp("Meghana",20,50000);
    	System.out.println("Employee Name:"+emp1.getName());
    	System.out.println("Employee Age:"+emp1.getAge());
    	System.out.println("Employee Salary"+emp1.getSalary());
    	
    	emp1.setName("kiran");
    	emp1.setAge(30);
    	emp1.setSalary(30000);
    	System.out.println("Employee Name:"+emp1.getName());
    	System.out.println("Employee Age:"+emp1.getAge());
    	System.out.println("Employee Salary"+emp1.getSalary());
   
    }
}
