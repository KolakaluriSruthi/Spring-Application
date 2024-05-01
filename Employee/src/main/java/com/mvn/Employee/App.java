package com.mvn.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//class methods
        //EmployeeClassMethods ecm =new EmployeeClassMethods();
       // ecm.insert(101,"srikar");
       // ecm.print();//
    	
    	//constructor 
    	//EmployeeConstructor ec = new EmployeeConstructor( 101,"srikar","java");
    	//ec.print();
    	
    	//setters//
    	EmployeeSetter es=new EmployeeSetter();
    	es.setId(101);
    	System.out.println(es.getId());
    	es.setName("sruthi");
    	System.out.println(es.getName());
    	es.setCourse("python");
    	System.out.println(es.getCourse());
    	
    }
}
